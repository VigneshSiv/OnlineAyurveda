package com.cg.oam.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="customer_Id")
	private int customerId;
	
	@Column(name="customer_Name")
	private String customerName;
	
	@Column(name="customer_Password")
	private String customerPassword;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Admin admin;
	/*@ManyToMany(fetch=FetchType.LAZY,mappedBy="Customer")
	private List<Medicine> medicine=new ArrayList<>();
	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="Customer")
	private Order order;*/

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	



	
}
