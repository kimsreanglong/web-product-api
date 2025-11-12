package com.setec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String uploadPath = System.getProperty("user.dir") + "/MyApp/static/";
		registry.addResourceHandler("/static/**")
		        .addResourceLocations("file:" + uploadPath);
//		registry.addResourceHandler("/static/**")
//				.addResourceLocations("file:/opt/myApp/static/");
//		/.addResourceLocations("file:/opt/myApp/static/"); for Linux
	}

}
