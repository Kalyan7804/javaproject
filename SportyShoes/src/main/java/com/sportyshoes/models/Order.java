package com.sportyshoes.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private long id;
	
	@Column(name = "order_date", nullable = false)
	private String date;

	@Column(name = "order_payment_mode", nullable = false)
	private String paymentmode;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "user_order", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
			@JoinColumn(name = "user_id") })
	private List<Users> users;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "products_order", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = {
			@JoinColumn(name = "product_id") })
	private List<Products> products;
	
	public Order() {}
	
	public Order(String date, String paymentmode) {
		super();
		this.date = date;
		this.paymentmode = paymentmode;
	}

	public Order(long id, String date, String paymentmode, List<Users> users, List<Products> products) {
		super();
		this.id = id;
		this.date = date;
		this.paymentmode = paymentmode;
		this.users = users;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public List<Users> getUser() {
		return users;
	}

	public void setUser(List<Users> users) {
		this.users = users;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", paymentmode=" + paymentmode + ", user=" + users + ", products="
				+ products + "]";
	}
	
	
	
	

}
