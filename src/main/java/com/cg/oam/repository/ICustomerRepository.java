package com.cg.oam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.cg.oam.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer>{
	
	@Query("SELECT cust FROM Customer cust")
	public List<Customer> showAllCustomers();
	
}
