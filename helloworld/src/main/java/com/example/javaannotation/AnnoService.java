package com.example.javaannotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("dddd")
public class AnnoService {   

	 	@Autowired
		CustomerDAO customerDAO;
	 	
	 	//@Autowired
	 	CustomerService customerService;
	 	
	 	CustomerService customerServiceOne; 
	 	
	 	//@Autowired
	 	public void setCustomerService(CustomerService customerService){
	 		this.customerService = customerService;
	 	}
	 	@Resource(name="customerService")
	 	public void setCustomerServiceOne(CustomerService customerService){
	 		this.customerServiceOne = customerService;
	 	}
		@Override
		public String toString() {
			return "AnnoService [customerDAO=" + customerDAO
					+ ", customerService=" + customerService
					+ ", customerServiceOne=" + customerServiceOne + "]";
		}

		
	 
		
	}

