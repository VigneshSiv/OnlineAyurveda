package com.cg.oam.entities;

import java.time.LocalDate;

public class Order {

	private int orderId;
	private LocalDate orderDate;
	private LocalDate dispatchDate;
	private float totalCost;
	private Customer customer;
	private String status;
	
	
}
