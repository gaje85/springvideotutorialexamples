package com.example.transactions.declarative.xml;


import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springjdbc.IUserDao;
import com.example.springjdbc.User;

public class TestDeclarativeTransactions {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/example/transactions/declarative/xml/declarativeTransactionContext.xml");
		IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
		User user=new User(generateId(), "john"+generateId(), "password", false);
		dao.insertUser(user);
		
		//dao.deleteUser(user.getId());
	}
	private static int generateId(){
		return new Random().nextInt(500);
	}
}
