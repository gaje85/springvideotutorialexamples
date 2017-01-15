package com.example.customer.bo.impl;

import com.example.customer.bo.CustomerBo;


public class CustomerBoImpl  {

	public void addCustomer(){
		System.out.println("addCustomer() is running ");
	}
	
	public String addCustomerReturnValue(){
		System.out.println("addCustomerReturnValue() is running ");
		return "abc";
	}
	
	public void addCustomerThrowException() throws Exception {
		System.out.println("addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}
	
	public String addCustomerAround(String name){
		System.out.println("addCustomerAround() is running, args : " + name);
		return "from around";
	}
}







