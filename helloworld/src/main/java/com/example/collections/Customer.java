package com.example.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
 
public class Customer 
{
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	private Properties pros;
 

	public Customer(){
		
		
	}


	public List<Object> getLists() {
		return lists;
	}


	public void setLists(List<Object> lists) {
		System.out.println("list called ..");
		this.lists = lists;
	}


	public Set<Object> getSets() {
		return sets;
	}


	public void setSets(Set<Object> sets) {
		System.out.println("set called ..");
		this.sets = sets;
	}


	public Map<Object, Object> getMaps() {
		return maps;
	}


	public void setMaps(Map<Object, Object> maps) {
		System.out.println("map called ..");
		this.maps = maps;
	}


	public Properties getPros() {
		return pros;
	}


	public void setPros(Properties pros) {
		System.out.println("props called ..");
		this.pros = pros;
	}
	
	
}