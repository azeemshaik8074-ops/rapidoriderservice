package com.rapido.rider.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String vehicletype;
	private String vehicleno;
	private String vehiclename;
	private int model;
	public Vehicle(String vehicletype, String vehicleno, String vehiclename, int model) {
		super();
		this.vehicletype = vehicletype;
		this.vehicleno = vehicleno;
		this.vehiclename = vehiclename;
		this.model = model;
	}
	public Vehicle() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicletype() {
		return vehicletype;
	}
	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
}
