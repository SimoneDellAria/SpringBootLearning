package it.mycompany.springboot.th.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.mycompany.springboot.th.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
