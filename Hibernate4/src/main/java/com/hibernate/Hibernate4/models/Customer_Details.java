package com.hibernate.Hibernate4.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer_Details {

	@Id
	@Column
	private int id;
	
	@Column
	private String mobile;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@OneToOne(mappedBy = "customer_details")
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer_Details() {
		
	}

	public Customer_Details(int id, String mobile, String email, String address) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer_Details [id=" + id + ", mobile=" + mobile + ", email=" + email + ", address=" + address + "]";
	} 
}
