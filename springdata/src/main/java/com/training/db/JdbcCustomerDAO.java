package com.training.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport implements CustomerDAO {
	// insert example
	public void insert(Customer customer) {

		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

		getJdbcTemplate().update(sql, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });

	}

	// insert batch example
	public void insertBatch(final List<Customer> customers) {

		String sql = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int rowNum) throws SQLException {
				Customer customer = customers.get(rowNum);
				ps.setLong(1, customer.getCustId());
				ps.setString(2, customer.getName());
				ps.setInt(3, customer.getAge());
			}

			@Override
			public int getBatchSize() {
				return customers.size();
			}
		});
	}

	// insert batch example with SQL
	public void insertBatchSQL(String sql) {

		getJdbcTemplate().batchUpdate(new String[] { sql });

	}

	// query single row with RowMapper
	public Customer findByCustomerId(int custId) {

		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

		Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { custId },
				new CustomerRowMapper());

		return customer;
	}

	// query single row with BeanPropertyRowMapper (Customer.class)
	public Customer findByCustomerId2(int custId) {

		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

		Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { custId },
				new BeanPropertyRowMapper(Customer.class));

		return customer;
	}

	// query mutiple rows with manual mapping
	public List<Customer> findAll() {

		String sql = "SELECT * FROM CUSTOMER";

		List<Customer> customers = getJdbcTemplate().query(sql, new RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
				Customer customer = new Customer();
				customer.setCustId(rs.getInt("CUST_ID"));
				customer.setName(rs.getString("NAME"));
				customer.setAge(rs.getInt("AGE"));
				return customer;
			}
		});

		return customers;
	}

	// query mutiple rows with BeanPropertyRowMapper (Customer.class)
	public List<Customer> findAll2() {

		String sql = "SELECT * FROM CUSTOMER";

		List<Customer> customers = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(Customer.class));

		return customers;
	}

	public String findCustomerNameById(int custId) {

		String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";

		String name = (String) getJdbcTemplate().queryForObject(sql, new Object[] { custId }, String.class);

		return name;

	}

}
