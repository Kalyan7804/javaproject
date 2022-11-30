package com.sportyshoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.dao.OrderDao;
import com.sportyshoes.models.Order;

@Service
public class OrderService {
	@Autowired
	private OrderDao orderDao;
	
	public Order placeorder(Long uid,List<Long> pid, Order order) {
		return orderDao.placeorder(uid,pid,order);
	}
	
	public Order getbyid(Long id) {
		return orderDao.getbyid(id);
	}
	
	public List<Order> getallOrders(){
		return orderDao.getallorders();
	}
	
	
	public String deletebyid(Long id) {
		return orderDao.deletebyid(id);
	}
	
	public List<Order> getbydate(String date){
		return orderDao.getbydate(date);
	}
	
	
	
	
}
