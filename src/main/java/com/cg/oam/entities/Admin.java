package com.cg.oam.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin  {
	@Id
	@GeneratedValue
	@Column(name="id")
	private String id;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private List<Customer> customer=new ArrayList<>();
	
	/*@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	@JoinColumn(name="userid")
	private User user;
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private Order order;
	@OneToMany(mappedBy="Admin",cascade=CascadeType.ALL)
	private Set<Medicine> medicine = new HashSet<>();*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	
}	
