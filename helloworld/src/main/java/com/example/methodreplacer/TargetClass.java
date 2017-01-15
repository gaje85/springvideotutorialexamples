package com.example.methodreplacer;

import java.util.List;
import java.util.ArrayList;

public class TargetClass {
	
	static List list = null;
	public static List getList(){
		list = new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		return list;
	}
	
	public static List getProperty(){
		return list;
	}
	
	public static void setList(List list1){
		list = list1;
	}
	
	public static void setProperty(List lis){
		list = lis;
	}

}
