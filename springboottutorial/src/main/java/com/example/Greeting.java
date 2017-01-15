package com.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {

	int id;
	String name;
	double gift;
	
	public Greeting(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGift() {
		return gift;
	}

	public void setGift(double gift) {
		this.gift = gift;
	}
	
}
