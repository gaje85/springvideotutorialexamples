package com.example.autowire;

public class Developer {
	private Language language;
 
	
	public Developer(Language language,Employee emp) {
		this.language = language;
		System.out.println("developer cons emp == "+emp);
	}


	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}
 
	
 
}