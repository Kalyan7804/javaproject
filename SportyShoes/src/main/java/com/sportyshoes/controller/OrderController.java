package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sportyshoes.models.Order;
import com.sportyshoes.services.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	
	@GetMapping("/user/product/order/{id}")
	public ResponseEntity<?> getbyid(@PathVariable("id") Long id){
		Order order = orderService.getbyid(id);
		if (order!=null) {
			return new ResponseEntity<Order>(order,HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("No order placed with this id...",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/user/product/order")
	public ResponseEntity<?> getallOrders(){
		if (orderService.getallOrders().isEmpty()!=true) {
			return new ResponseEntity<List<Order>>(orderService.getallOrders(),HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("No order placed yet...",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/admin/order")
	public ResponseEntity<?> getallOrdersbyadmin(){
		List<Order> orders = orderService.getallOrders();
		if (orders.isEmpty()!=true) {
			return new ResponseEntity<List<Order>>(orders,HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("No order placed yet...",HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/user/{uid}/product/{pid}/order")
	public ResponseEntity<?> placeorder(@PathVariable("uid") Long uid,
										@PathVariable("pid") List<Long> pid,
										@RequestBody Order order){
		Order placeorder = orderService.placeorder(uid,pid,order);
		if (placeorder!=null) {
			return new ResponseEntity<Order>(placeorder,HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Something went wrong[check userid and productid]",HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("/user/product/order/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable("id") Long id){
		return new ResponseEntity<String>(orderService.deletebyid(id),HttpStatus.OK);
	}
	
	@GetMapping("/admin/order/{date}")
	public ResponseEntity<?> getbydate(@PathVariable("date") String date){
		List<Order> orders = orderService.getbydate(date);
		if (orders.isEmpty()==false) {
			return new ResponseEntity<List<Order>>(orders,HttpStatus.FOUND);
		}
		return new ResponseEntity<String>("No order placed with this date",HttpStatus.NOT_FOUND);
	}
	

	
	
	
	
	

}
