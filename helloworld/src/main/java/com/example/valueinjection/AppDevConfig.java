package com.example.valueinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppDevConfig {
	
	public AppDevConfig(){
		
	}

	@Bean
	public Prices getPrice(){
		Prices prices = new Prices();
		prices.setName("pen");
		prices.setPrices(200);
		return prices;
	}
}
