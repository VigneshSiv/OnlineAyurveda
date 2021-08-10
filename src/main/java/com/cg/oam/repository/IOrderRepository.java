package com.cg.oam.repository;


import java.util.List;

import com.cg.oam.entities.Medicine;
import com.cg.oam.entities.Order;
import com.cg.oam.exception.OrderNotFoundException;

public interface IOrderRepository {

	public Order addOrder(Order order);
	public Order updateOrder(Order order) throws OrderNotFoundException;
	public Order cancelOrder(int id) throws OrderNotFoundException;
	public List<Order> showAllMedicine(int id);
	public double calculateTotalCost(List<Medicine> list);
 }
