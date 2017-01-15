package com.example.autowire;

	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
	@Component
	public class Customer {
	 
		
		
		Person person;

		public Customer(){
			
		}

		public Person getPerson() {
			return person;
		}
		@Autowired
		public void setPerson(@Qualifier("person1") Person person) {
			this.person = person;
		}
		
		
		
		
	}


