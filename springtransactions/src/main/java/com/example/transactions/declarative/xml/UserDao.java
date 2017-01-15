package com.example.transactions.declarative.xml;


import java.sql.Types;
import java.util.Vector;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.springjdbc.IUserDao;
import com.example.springjdbc.User;



public class UserDao implements IUserDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void deleteUser(int uid) {
		System.out.println("Delete called ..");
		String delQuery = "delete from users where id = ?";
		jdbcTemplate.update(delQuery, new Object[]{uid});

	}

	public int insertUser(User user)  {
		System.out.println("Insert called ..");
		String inserQuery = "insert into users (username, password, enabled , id) values (?, ?, ?, ?) ";
		Object[] params = new Object[]{user.getUserName(), user.getPassword(),user.isEnabled(),user.getId()};
		int[] types = new int[]{Types.VARCHAR,Types.VARCHAR,Types.BIT,Types.INTEGER};
		int number =  jdbcTemplate.update(inserQuery,params,types);
		
		/*Vector vec = null;
		vec.add("one");*/
		int count = 100;
		int k = count/0;
		return number;
	}

	public User selectUser(int uid) {
	
		throw new RuntimeException("An intentional runtime exception");

	}

	public int updateUser(User user) throws Exception {
		
		throw new NullPointerException("An intentional Null pointer exception");
	}

}

