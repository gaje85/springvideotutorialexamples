package com.training.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement(name = "fruittwo")
public class Fruit {

	
	String name;
	
	int quality;
	@JsonProperty(value="nametwo")
	public String getName() {
		return name;
	}

	@XmlElement(name="nametwo")
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	@JsonProperty(value="qualitytwo")
	public int getQuality() {
		return quality;
	}

	@XmlElement(name="qualitytwo")
	
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Fruit(String name, int quality) {
		this.name = name;
		this.quality = quality;
	}

	public Fruit() {
	}

}