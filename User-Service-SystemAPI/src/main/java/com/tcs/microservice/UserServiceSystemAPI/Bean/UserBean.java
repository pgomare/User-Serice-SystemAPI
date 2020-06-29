package com.tcs.microservice.UserServiceSystemAPI.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Service")
public class UserBean {
	
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="lastname")
	private String lname;
	@Column(name="city")
	private String city;
	@Column(name="password")
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

	
	
	public UserBean(Long id, String name, String lname, String city, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.city = city;
		this.password = password;
		
	}
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
}