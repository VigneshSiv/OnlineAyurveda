package com.cg.oam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.oam.entities.Customer;
import com.cg.oam.repository.ICustomerRepository;
@Service
public class ICustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerRepository  CustomerRepo;
	@Override
	public List<Customer> addCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		CustomerRepo.saveAndFlush(Customer);
		return   CustomerRepo.findAll();
		
	}

	@Override
	public List<Customer> updateCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		CustomerRepo.saveAndFlush(Customer);
		return  CustomerRepo.findAll() ;
		
	}

	@Override
	public List<Customer> cancelCustomer(int CustomerId) {
		// TODO Auto-generated method stub
		CustomerRepo.deleteById(CustomerId);
		return   CustomerRepo.findAll();
		
	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return CustomerRepo.findAll();
	}

}
