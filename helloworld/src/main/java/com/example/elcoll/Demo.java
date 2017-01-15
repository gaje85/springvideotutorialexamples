package com.example.elcoll;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Demo {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("elcoll.xml");
 
	    Customer obj = (Customer) context.getBean("customerBean");
	    System.out.println(obj);

	}
}