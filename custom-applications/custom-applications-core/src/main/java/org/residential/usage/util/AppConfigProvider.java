package org.residential.usage.util;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfigProvider {

	@Value("${app.config.json.path:application/config.json}")
	private String configJsonPath;
	
	private Map appConfig;
	
	@PostConstruct
	public void initialize(){
		
	}
	
}
