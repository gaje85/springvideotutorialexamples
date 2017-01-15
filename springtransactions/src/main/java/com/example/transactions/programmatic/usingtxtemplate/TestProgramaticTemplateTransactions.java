package com.example.transactions.programmatic.usingtxtemplate;


import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springjdbc.IUserDao;
import com.example.springjdbc.User;


public class TestProgramaticTemplateTransactions {
	public static void main(String[] args) throws ClassNotFoundException {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/example/transactions/programmatic/usingtxtemplate/txTemplateContext.xml");
		IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
		int id = generateId();
		User user=new User(id, "john"+generateId(), "passowrd", false);
		dao.insertUser(user);
		//dao.deleteUser(id);
		
		
		
	}
	private static int generateId(){
		return new Random().nextInt(500);
	}
}
