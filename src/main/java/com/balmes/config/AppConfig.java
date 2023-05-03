package com.balmes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.balmes.repository.cursRepository;
import com.balmes.service.cursService;

@Configuration
@ComponentScan("com.balmes")
public class AppConfig {

	/*
	@Bean("cursRepositori")
	public cursRepository getCursRepository() {
		return new cursRepository();
	}
	
	@Bean("cursServei")
	public cursService getCursService() {
//		return new cursService();
		return new cursService(getCursRepository());
	}
	*/
}
