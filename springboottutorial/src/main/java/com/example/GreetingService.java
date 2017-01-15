package com.example;

import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingService {

	
	public GreetingService(){
		
	}
	
	@RequestMapping(value="/greeting",consumes="application/xml",produces="application/json",method=RequestMethod.POST)
	public Greeting hello(@RequestBody Greeting greet){
		System.out.println("Name == "+greet.getName());
		System.out.println("gift == "+greet.getGift());
		System.out.println("id == "+greet.getId());
		Greeting greeting = new Greeting();
		greeting.setGift(23.03);
		greeting.setId(222);
		greeting.setName("Sathish");
		return greeting;
	}
}
