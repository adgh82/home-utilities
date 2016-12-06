package org.residential.usage.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JSONUtil {
private static final Logger LOG = LoggerFactory.getLogger(JSONUtil.class);
	
	private static final Gson gson= new Gson();

	public static void marshaller(Object entity, String filePath) throws JsonIOException, IOException{
		LOG.debug("marshalling {} to {}",entity.toString(), filePath);
		gson.toJson(entity, new FileWriter(filePath));
	}
	
	
	public static Map<String,Object> unmarshaller(String filePath) throws JsonSyntaxException, JsonIOException, FileNotFoundException{
		LOG.debug("unmarshalling {} ", filePath);
		Map<String, Object> unmarshalledFile = gson.fromJson(new FileReader(filePath), Map.class);
		return unmarshalledFile;
	}
	
	public static void marshaller(Object entity, File file) throws JsonIOException, IOException{
		marshaller(entity, file.getAbsolutePath());
	}
	
	public static Map<String,Object> unmarshaller(File file) throws JsonSyntaxException, JsonIOException, FileNotFoundException{
		return unmarshaller(file.getAbsolutePath());
	}
}
