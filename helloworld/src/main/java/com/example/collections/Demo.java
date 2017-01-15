package com.example.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		try{
			
			
			ApplicationContext contx = new ClassPathXmlApplicationContext("collections.xml");
			Customer cus = (Customer)contx.getBean("customer");
			System.out.println(cus.getLists());
			
			 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
