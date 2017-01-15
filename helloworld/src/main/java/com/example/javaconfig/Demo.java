package com.example.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.javaannotation.CustomerService;
import com.training.basic.Address;
import com.training.basic.CustomerInfo;

public class Demo {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfigOne.class);
 
		CustomerInfo customer = (CustomerInfo) context.getBean("cusInfo");
		customer.print();
 
		Address add = (Address) context.getBean("address");
		Address addOne = (Address) context.getBean("address");
		CustomerService cs = (CustomerService)context.getBean("customerservice");
		System.out.println(cs);
		System.out.println(add);
		System.out.println(addOne);
		add.print();
		
		/*context.scan("com.example");
		context.register(ApplicationConfig.class, AddressConfig.class);
		context.refresh();*/

	}

}
