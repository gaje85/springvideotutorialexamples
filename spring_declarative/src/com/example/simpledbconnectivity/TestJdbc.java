package com.example.simpledbconnectivity;


import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springjdbc.IUserDao;
import com.example.springjdbc.User;


public class TestJdbc {
	public static void main(String[] args) throws ClassNotFoundException {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/example/simpledbconnectivity/jdbcContext.xml");
		IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);
		int userId = generateId();
		User user = new User(userId, "apurav", "12345", false);
		dao.insertUser(user);
		System.out.println("User inserted with id= " + userId);
		dao.deleteUser(984);
	}

	private static int generateId() {
		return new Random().nextInt(999);
	}
}
