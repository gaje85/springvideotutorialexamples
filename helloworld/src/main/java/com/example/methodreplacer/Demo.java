package com.example.methodreplacer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		try{
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("methodreplacer.xml");
			
			Object type1 = context.getBean("javaVersion");
			System.out.println("The value == "+type1);
			
			
			BeanFieldValue type2 = (BeanFieldValue)context.getBean("FieldBean");
			System.out.println("The value == "+type2.getIsolation());
			
			Calculator cal = (Calculator)context.getBean("cal");
			System.out.println(cal);
			System.out.println(cal.sub(100, 100)); 
	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
