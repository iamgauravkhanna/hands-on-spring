package com.example.movie.database.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.movie.database.interceptor.MyRequestInterceptor;

@Component
public class ApiWebAppConfig extends WebMvcConfigurerAdapter {

	@Autowired
	MyRequestInterceptor interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}

}