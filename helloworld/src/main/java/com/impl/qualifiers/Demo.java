package com.impl.qualifiers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
 
		
		context.scan("com.impl");
		context.refresh();
		ItemTypes itemTypes = context.getBean(ItemTypes.class);
		System.out.println(itemTypes.boardItem + " e"+itemTypes.markerItem);
		
		

	}

}
