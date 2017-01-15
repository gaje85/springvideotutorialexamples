package com.example.elref;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Demo {
	public static void main(String[] args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("elref.xml");
 
	    Customer obj = (Customer) context.getBean("customerBean");
	    System.out.println("dd"+obj);

	}
}