package com.training.db;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("daoexample.xml");
			MysqlSpringDAO dao = appContext.getBean(MysqlSpringDAO.class);
			System.out.println(dao.getUserInfo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
