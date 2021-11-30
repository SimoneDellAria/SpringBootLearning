package it.mycompany.springboot.th.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mycompany.springboot.th.dao.CustomerRepository;
import it.mycompany.springboot.th.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findById(int id) {
		Optional<Customer> result = customerRepository.findById(id);
		Customer customer = null;
		if (result.isPresent()) {
			customer = result.get();
		} else {
			throw new RuntimeException("Did not find customer id - " + id);
		}
		return customer;
	}

	@Override
	public void save(Customer customer) {
		this.customerRepository.save(customer);
	}

	@Override
	public void deleteById(int id) {
		this.customerRepository.deleteById(id);
	}

}
