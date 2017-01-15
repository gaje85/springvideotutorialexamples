package com.example.valueinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		try {
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
			Prices prices = applicationContext.getBean(Prices.class);
			System.out.println(prices.getPrices());
			applicationContext.close();
			
			ClassPathXmlApplicationContext appXML = new ClassPathXmlApplicationContext("valueinjection.xml");
			Prices pricesOne = (Prices)appXML.getBean("prices");
			System.out.println(pricesOne.getPrices());
			appXML.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
