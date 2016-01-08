package com.tech.doks.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity (name ="User_Details" )
public class UserDetails {
	@Id
	@GeneratedValue
	@Column (name = "User_Id")
	private int userId;
	@Column (name = "User_Name")
	private String userName;
	@OneToOne
	@JoinColumn(name="Vehical_Id")
	private Vehicle vehical;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Vehicle getVehical() {
		return vehical;
	}
	public void setVehical(Vehicle vehical) {
		this.vehical = vehical;
	}
}
