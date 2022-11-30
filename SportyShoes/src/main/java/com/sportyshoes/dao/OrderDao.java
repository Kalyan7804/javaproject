package com.sportyshoes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Repository;

import com.sportyshoes.models.Categories;
import com.sportyshoes.models.Order;
import com.sportyshoes.models.Products;
import com.sportyshoes.models.Users;
import com.sportyshoes.repository.categoryrepo;
import com.sportyshoes.repository.orderrepo;
import com.sportyshoes.repository.productrepo;
import com.sportyshoes.repository.userrepo;

@Repository
public class OrderDao {
	
	@Autowired
	private orderrepo orderrepo;
	@Autowired
	private productrepo productrepo;
	@Autowired
	private userrepo userrepo;
	@Autowired
	private categoryrepo categoryrepo;
	
	public Order placeorder(Long uid, List<Long> pid, Order order) {

		try {
			List<Products> products = new ArrayList<Products>();
			for (Long id : pid) {
				Optional<Products> productdata = productrepo.findById(id);
				Products product = productdata.get();
				products.add(product);
			}

			Optional<Users> userdata = userrepo.findById(uid);
			Users user = userdata.get();
			List<Users> users = new ArrayList<Users>();
			users.add(user);

			order.setUser(users);
			order.setProducts(products);

			return orderrepo.save(order);

		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	
	public Order getbyid(Long id) {
		try {
			Optional<Order> data = orderrepo.findById(id);
			return data.get();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	
	public List<Order> getallorders() {
		try {
			return orderrepo.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	
	public String deletebyid(Long id) {
		try {
			orderrepo.deleteById(id);
			return "Order deleted successfully";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	
	public List<Order> getbydate(String date) {
		try {
			return orderrepo.findByDate(date);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	

	

}
