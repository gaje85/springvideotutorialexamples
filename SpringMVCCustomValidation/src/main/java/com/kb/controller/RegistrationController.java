package com.kb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kb.model.Customer;
import com.kb.validator.CustomerValidator;

@Controller
public class RegistrationController {
	
	@Autowired
	CustomerValidator customerValidator;
	
	
	
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	    public String viewRegistrationPage(Model model) {
	        Customer customer = new Customer();
	        model.addAttribute("customer", customer);
	        return "register";
	    }
	
	 @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	    public String doLogin(@Valid Customer customer, BindingResult result,Model model) {
		 model.addAttribute("customer",customer);
		 customerValidator.validate(customer, result);
	      if(result.hasErrors()){
	    	  return "register";
	      }
	      
	      return "home";
	    }

	public CustomerValidator getCustomerValidator() {
		return customerValidator;
	}

	public void setCustomerValidator(CustomerValidator customerValidator) {
		this.customerValidator = customerValidator;
	}

}
