package com.phase2.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="flights")
@Table(name="flights")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="flight_id")
	protected int id;
	
	@Column(name="flight_origin")
	protected String origin;
	
	@Column(name = "flight_destination")
	protected String destination;
	
	@Column(name = "flight_date")
	protected String date;
	
	@Column(name = "flight_time")
	protected String time;
	
	@Column(name = "flight_price")
	protected double price;
	
	public Flight() {}
	
	

	public Flight(String origin, String destination, String date, String time, double price) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.time = time;
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Flight [id=" + id + ", origin=" + origin + ", destination=" + destination + ", date=" + date + ", time="
				+ time + ", price=" + price + "]";
	}
	
	
	
}
