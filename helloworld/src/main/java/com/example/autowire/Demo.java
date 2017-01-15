package com.example.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		try{
		
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("autowire.xml");
			Employee emp = (Employee)appContext.getBean("employee");
			A a = (A)appContext.getBean("a");
			System.out.println(" a == "+a.getBb());
			System.out.println("emp == "+emp.getAdd());
			Developer dev = (Developer)appContext.getBean("developer");
			System.out.println("dev == "+dev.getLanguage().getName());
			Customer cus = (Customer)appContext.getBean("customer");
			System.out.println(cus.person.getName());
			
			
			//Customer cust = (Customer)factory.getBean("customer");
			//System.out.println(cust.getPerson().getName());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
