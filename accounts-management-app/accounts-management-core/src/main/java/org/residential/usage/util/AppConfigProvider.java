package org.residential.usage.util;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppConfigProvider {
	
	private static final Logger LOG = LoggerFactory.getLogger(AppConfigProvider.class);

	@Value("${app.config.json.path:application/config.json}")
	private String configJsonPath;
	
	private static Map appFlatConfig;
	private static Map originalMap;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@PostConstruct
	public void initialize(){
		try {
			File configJsonFile = applicationContext.getResource(Constants.CLASSPATH_STRING+Constants.COLON+configJsonPath).getFile();
			originalMap = JSONUtil.unmarshaller(configJsonFile);
			flattenMap(originalMap,appFlatConfig,null);
		} catch (IOException e) {
			LOG.error("Error occurred unmarshalling config JSON",e);
		}
	}
	
	public static String getFlatAppConfigValue(String keyPath){
		String value=null;
		if(MapUtils.isEmpty(appFlatConfig)){
			LOG.warn("Config map is empty");
			return value;
		}
		if(StringUtils.isNotBlank(keyPath)){
			value = (String)appFlatConfig.get(keyPath);
		}else{
			LOG.warn("keyPath is found null for getting application config value");
		}
		return value;
	}
	
	public static Map getAppConfig(String key){
		Map configSubMap=null;
		if(StringUtils.isNotBlank(key)){
			configSubMap = (Map)originalMap.get(key);
		}
		return configSubMap;
	}
	
	private void flattenMap(Map map, Map flatMap, String key){
		if(MapUtils.isEmpty(flatMap)){
			flatMap=new HashMap();
		}
		Set entrySet = map.entrySet();
		Entry mapEntry=null;
		String tempKey=(StringUtils.isNotBlank(key)?key:null);
		Object valueObj;
		Iterator entrySetIterator = entrySet.iterator();
		while(entrySetIterator.hasNext()){
			mapEntry = (Entry)entrySetIterator.next();
			valueObj = mapEntry.getValue();
			if(valueObj instanceof String){
				flatMap.put(getEffectiveKey(tempKey, mapEntry.getKey().toString()), valueObj.toString());
			}else{
				flattenMap((Map)valueObj, flatMap, getEffectiveKey(tempKey, mapEntry.getKey().toString()));
			}
		}
		
	}
	
	private static String getEffectiveKey(String tempKey, String key){
		return (StringUtils.isNotBlank(tempKey)?tempKey+Constants.PERIOD+key:key);
	}
	
	
	
}
