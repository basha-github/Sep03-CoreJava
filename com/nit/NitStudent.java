package com.nit;

public class NitStudent {
	
	private int rollNo;
	private int fee;
	private String course;
	private String phone;
	private String aadharNo;
	public NitStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NitStudent(int rollNo, int fee, String course, String phone, String aadharNo) {
		super();
		this.rollNo = rollNo;
		this.fee = fee;
		this.course = course;
		this.phone = phone;
		this.aadharNo = aadharNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public NitStudent setRollNo(int rollNo) {
		this.rollNo = rollNo;
		return this;
	}
	public int getFee() {
		return fee;
	}
	public NitStudent setFee(int fee) {
		this.fee = fee;
		return this;
	}
	public String getCourse() {
		return course;
	}
	public NitStudent setCourse(String course) {
		this.course = course;
		return this;
	}
	public String getPhone() {
		return phone;
	}
	public NitStudent setPhone(String phone) {
		this.phone = phone;
		
		return this;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public NitStudent setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
		
		return this;
	}
	
	
	
	
	
	
	
	

}
