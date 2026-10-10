package com.rapido.rider.dto;

public class RiderDto {
	private String ridername;
	private String gender;
	private long mobile;
	private String mail; 
	private String drivinglicense;
	
	private VehicleDto vehicle;
	public RiderDto(String ridername, String gender, long mobile, String mail, String drivinglicense,
			VehicleDto vehicle) {
		super();
		this.ridername = ridername;
		this.gender = gender;
		this.mobile = mobile;
		this.mail = mail;
		this.drivinglicense = drivinglicense;
		
		this.vehicle = vehicle;
	}
	public RiderDto() {
		super();
	}
	public String getRidername() {
		return ridername;
	}
	public void setRidername(String ridername) {
		this.ridername = ridername;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDrivinglicense() {
		return drivinglicense;
	}
	public void setDrivinglicense(String drivinglicense) {
		this.drivinglicense = drivinglicense;
	}
	
	public VehicleDto getVehicle() {
		return vehicle;
	}
	public void setVehicle(VehicleDto vehicle) {
		this.vehicle = vehicle;
	}

	
}
