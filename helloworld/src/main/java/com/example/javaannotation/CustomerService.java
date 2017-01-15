package com.example.javaannotation;

import org.springframework.stereotype.Component;
 
@Component
public class CustomerService
{
	//@Value("test")
	String message;
 
	public String getMessage() {
	  return message;
	}
 
	public void setMessage(String message) {
	  this.message = message;
	}
 
	
	public void initIt() throws Exception {
	  System.out.println("Init method after properties are set : " + message);
	}
 

	public void cleanUp() throws Exception {
	  System.out.println("Customer clean up");
	}
 
}