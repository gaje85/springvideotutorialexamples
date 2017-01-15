package com.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlSpringDAO {

	JdbcTemplate jdbcTemplate;
	
	public MysqlSpringDAO(){
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<UserInfo> getUserInfo(){
		//List<UserInfo> userInfoList = new ArrayList<UserInfo>();
		List<UserInfo> userInfoList =  jdbcTemplate.query("select * from userinfo", new RowMapper<UserInfo>() {

			@Override
			public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserInfo userInfo = new UserInfo();
				userInfo.setId(rs.getInt("id"));
				userInfo.setEmail(rs.getString("email"));
				userInfo.setName(rs.getString("name"));
				userInfo.setPassword(rs.getString("password"));
				userInfo.setStatus(rs.getInt("status"));
				return userInfo;
			}
			
		});
		return userInfoList;
	}
	
}
