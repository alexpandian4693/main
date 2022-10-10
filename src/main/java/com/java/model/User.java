package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String role;
	private int loginhours;
	private float price;
	public User(int id, String name, String role , int loginhours, float price ) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.loginhours=loginhours;
		this.price=price;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + ",loginhours=" + loginhours + ",price" + price + "]";
	}
	public int getLoginhours() {
		return loginhours;
	}
	public void setLoginhours(int loginhours) {
		this.loginhours = loginhours;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
