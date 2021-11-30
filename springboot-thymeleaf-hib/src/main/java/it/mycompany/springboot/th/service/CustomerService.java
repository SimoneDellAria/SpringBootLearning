package it.mycompany.springboot.th.service;

import java.util.List;

import it.mycompany.springboot.th.entity.Customer;

public interface CustomerService {

public List<Customer> findAll();
	
	public Customer findById(int id);
	
	public void save(Customer customer);
	
	public void deleteById(int id);
	
}
