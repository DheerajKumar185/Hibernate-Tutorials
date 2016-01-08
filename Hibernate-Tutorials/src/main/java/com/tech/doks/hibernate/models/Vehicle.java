package com.tech.doks.hibernate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity (name="Vehicle_Details")
public class Vehicle {
	@Id
	@GeneratedValue
	@Column (name = "Vehical_Id")
	private int vehicalId;
	@Column (name = "Vehical_Name")
	private String vehicalName;
	public int getVehicalId() {
		return vehicalId;
	}
	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}
	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
}
