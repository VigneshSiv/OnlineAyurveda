package com.cg.oam.service;


import java.util.List;

import org.springframework.stereotype.Service;


import com.cg.oam.entities.Customer;

@Service
public interface ICustomerService {
	public List<Customer> addCustomer(Customer Customer);
	public List<Customer> updateCustomer(Customer Customer);
	public List<Customer> cancelCustomer(int CustomerId) ;
	public List<Customer> showAllCustomers();
}
