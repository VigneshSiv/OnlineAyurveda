package com.cg.oam.repository;

import java.util.List;

import com.cg.oam.entities.Customer;
import com.cg.oam.exception.CustomerNotFoundException;

public interface ICustomerRepository {

	public Customer addCustomer(Customer Customer);
	public Customer updateCustomer(Customer Customer) throws CustomerNotFoundException;
	public Customer cancelCustomer(int Customerid) throws CustomerNotFoundException;
	public List<Customer> showAllCustomers(int cid);
	
}
