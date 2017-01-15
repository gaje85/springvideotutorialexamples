package com.training.db;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper
{
	//@Autowired
	//Customer cus;
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustId(rs.getInt("CUST_ID"));
		customer.setName(rs.getString("NAME"));
		customer.setAge(rs.getInt("AGE"));
		return customer;
	}
	
}
