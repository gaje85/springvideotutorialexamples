package com.sample.main;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.domain.Events;
import com.sample.repository.EventsBo;
import com.sample.service.EventServiceBO;

@Named
public class Demo {
	
	@Inject
	EventServiceBO eventServiceBo;
	
	public Demo(){
		
	}
	
	public List<Events> getAllEvents(){
		return eventServiceBo.getAllEvents();
	}
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("springconfig.xml");
			Demo demoMain = appContext.getBean(Demo.class);
			List<Events> list = demoMain.getAllEvents();
			System.out.println(list);
			appContext.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
