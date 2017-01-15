package com.example.valueinjection;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:prices.properties")
@Profile("prod")
public class AppConfig {
	
	@Inject
	Environment env;
	
	public AppConfig(){
		
	}

	@Bean
	public Prices getPrice(){
		Prices prices = new Prices();
		prices.setName("pencil");
		int priceVal = env.getProperty("pencil", Integer.class);
		prices.setPrices(priceVal);
		return prices;
	}
}
