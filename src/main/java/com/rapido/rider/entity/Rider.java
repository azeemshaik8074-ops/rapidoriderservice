package com.rapido.rider.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Rider {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ridername;
	private long mobile;
	private String gender;
	private double wallet;
	private int noofrides;
	private String drivinglicense;
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicle vehicle;
	private String status;
	private String mail;
	public Rider(String ridername, long mobile, String gender, double wallet, int noofrides, String drivinglicense,
			Vehicle vehicle,String status,String mail) {
		super();
		this.ridername = ridername;
		this.mobile = mobile;
		this.gender = gender;
		this.wallet = wallet;
		this.noofrides = noofrides;
		this.drivinglicense = drivinglicense;
		this.vehicle = vehicle;
		this.status=status;
		this.mail=mail;
		}
	public Rider() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRidername() {
		return ridername;
	}
	public void setRidername(String ridername) {
		this.ridername = ridername;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getWallet() {
		return wallet;
	}
	public void setWallet(double wallet) {
		this.wallet = wallet;
	}
	public int getNoofrides() {
		return noofrides;
	}
	public void setNoofrides(int noofrides) {
		this.noofrides = noofrides;
	}
	public String getDrivinglicense() {
		return drivinglicense;
	}
	public void setDrivinglicense(String drivinglicense) {
		this.drivinglicense = drivinglicense;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	

}
