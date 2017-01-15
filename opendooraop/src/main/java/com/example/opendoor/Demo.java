package com.example.opendoor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("opendoor.xml");
			//OpenDoor openDoor = appContext.getBean(OpenDoor.class);
			OpenDoor openDoor = (OpenDoor)appContext.getBean("opendoorimpl");
			System.out.println(openDoor.getClass().getName());
			//openDoor.openDoorWithKey(100);
			//openDoor.openDoorWithPassword();
			//openDoor.throwErr();
			openDoor.openDoorWithReturn();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
