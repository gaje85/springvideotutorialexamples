package com.example.javaannotation;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="ee")  // example
public class Example {
	
	@Autowired
	CustomerService customerService;
	
	@Inject
	ExampleNamed exampleNamed;
	
	public Example(){
		
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public ExampleNamed getExampleNamed() {
		return exampleNamed;
	}

	public void setExampleNamed(ExampleNamed exampleNamed) {
		this.exampleNamed = exampleNamed;
	}
	
	
	
	

}
