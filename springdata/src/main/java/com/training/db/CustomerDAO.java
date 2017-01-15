package com.training.db;



import java.util.List;


public interface CustomerDAO 
{
	public void insert(Customer customer);
	
	public void insertBatch(List<Customer> customer);
				
	public void insertBatchSQL(String sql);
	
	public Customer findByCustomerId(int custId);
	
	public Customer findByCustomerId2(int custId);

	public List<Customer> findAll();
	
	public List<Customer> findAll2();
	
	public String findCustomerNameById(int custId);
	
	
}




