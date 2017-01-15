package com.example.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.customer.bo.impl.CustomerBoImpl;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBoImpl customer = (CustomerBoImpl) appContext.getBean("customerBo");
		System.out.println(customer.getClass().getName());
		customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
	  // customer.addCustomerThrowException();
		
		//String response = customer.addCustomerAround("example");
		//System.out.println("res from main"+response);

	}
}


class TargeClass {
	
	public void businessOne(){
		
	}
}
// subclass to the target using CGlib and then its
// overrides the method . it calls aspect first then it 
// calls super.methodName();
interface Inter{
	public void businessOne();
}
// Proxy which implements my interface and this proxy
// will call ASpect first and then my business logic
// method

class Aspect {
	public void logBefore(){
		
	}
}

class Test{
	
	int i = 100;
	public Test(){ // --> start
		// before change
		i = i++;
		//after change
	} // --> end 
	public void test(){ //---> beforemethod
	
	} //---> after
	  //---> around
	  // ---> throws 
	  // ---> throwsfinal
}









