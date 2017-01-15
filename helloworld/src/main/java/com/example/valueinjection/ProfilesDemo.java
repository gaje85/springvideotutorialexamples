package com.example.valueinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProfilesDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
				
		applicationContext.getEnvironment().setActiveProfiles("prod");
		applicationContext.register(AppConfig.class,AppDevConfig.class);
		applicationContext.refresh();
		Prices prices = applicationContext.getBean(Prices.class);
		System.out.println(prices.getPrices());
		applicationContext.close();
		
	}

}
