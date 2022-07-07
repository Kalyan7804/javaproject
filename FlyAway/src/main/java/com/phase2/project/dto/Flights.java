package com.phase2.project.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight_detail")
public class Flights {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flight_id")
	protected int id;
	
	@Column(name="flight_origin")
	protected String origin;
	
	@Column(name = "flight_destination")
	protected String destination;
	
	@Column(name = "flight_date")
	protected String date;
	
	@Column(name="airline")
	protected String airline;
	
	@Column(name = "flight_time")
	protected String time;
	
	@Column(name = "flight_price")
	protected double price;
	
	public Flights() {}
	
	
	

	public Flights(String origin, String destination, String date, String airline, String time, double price) {
		
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.airline = airline;
		this.time = time;
		this.price = price;
	}




	public Flights(int id, String origin, String destination, String date, String airline, String time, double price) {
		
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.date = date;
		this.airline = airline;
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

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
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
		return "Flights [id=" + id + ", origin=" + origin + ", destination=" + destination + ", date=" + date
				+ ", airline=" + airline + ", time=" + time + ", price=" + price + "]";
	}
	
	

	
	
}
