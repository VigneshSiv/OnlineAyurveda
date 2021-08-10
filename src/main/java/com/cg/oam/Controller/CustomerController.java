package com.cg.oam.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cg.oam.entities.Customer;
import com.cg.oam.service.ICustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	@Autowired
	private ICustomerService CustomerService;
	
	@PutMapping("/Customers")
	public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer Customer){
		List<Customer> Customers= CustomerService.updateCustomer(Customer);
		if(Customers.isEmpty())
		{
			return new ResponseEntity("Sorry! Products not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Customer>>(Customers, HttpStatus.OK);
	}
	
	@PostMapping("/Customers")
	public ResponseEntity<List<Customer>> addCustomer(@RequestBody Customer Customer){
		List<Customer> Customers= CustomerService.addCustomer(Customer);
		if(Customers.isEmpty())
		{
			return new ResponseEntity("Sorry! Products not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Customer>>(Customers, HttpStatus.OK);
	}
	
	@DeleteMapping("/Customers/{customerId}")
	public ResponseEntity<List<Customer>> cancelCustomer(@PathVariable("CustomerId")Integer CustomerId){
		List<Customer> Customers= CustomerService.cancelCustomer(CustomerId);
		if(Customers.isEmpty() || Customers==null) {
			return new ResponseEntity("Sorry! ProductsId not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Customer>>(Customers, HttpStatus.OK);
	}
	
	@GetMapping("/Customers")
	public ResponseEntity<List<Customer>> showAllCustomers(){
		List<Customer> Customers= CustomerService.showAllCustomers();
		if(Customers.isEmpty()) {
			return new ResponseEntity("Sorry!  not available!", 
					HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Customer>>(Customers, HttpStatus.OK);
	}

}
