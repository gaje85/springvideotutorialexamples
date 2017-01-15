package com.sample.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sample.domain.Events;


public class EventBoImpl implements EventsBo {

	JdbcTemplate jdbcTemplate;

	public EventBoImpl() {

	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Events> getAllEvents() {
		String sql = "select * from events";

		List<Events> eventList = jdbcTemplate.query(sql, new RowMapper<Events>() {
			@Override
			public Events mapRow(ResultSet rs, int rowNum) throws SQLException {
				Events events = new Events();
				events.setId(rs.getInt("event_id"));
				events.setDate(rs.getDate("event_date"));
				events.setTitle(rs.getString("title"));
				return events;
			}
		});
		return eventList;
	}

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("springconfig.xml");
			EventsBo dao = appContext.getBean(EventsBo.class);
			List<Events> list = dao.getAllEvents();
			System.out.println(list);
			appContext.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
