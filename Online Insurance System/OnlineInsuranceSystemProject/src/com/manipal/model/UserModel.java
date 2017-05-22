package com.manipal.model;



public class UserModel {
	
	private long userId;
	private String name;
	private String DOB;
	private String gender;
	private String panNo;
	private Double salary;
	private long mobNo;
	private String nationality;
	private String password;
	private String status;
	
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	public UserModel(long userId, String name, String dOB, String gender,
			String panNo, double salary, long mobNo, String nationality,
			String password, String status) {
		
		super();
		
		this.name = name;
		this.DOB = dOB;
		this.gender = gender;
		this.panNo = panNo;
		this.salary = salary;
		this.mobNo = mobNo;
		this.nationality = nationality;
		this.password = password;
		this.status = status;
	}

	public UserModel(long userId, String name, String dOB, String gender,
			String panNo, double salary, long mobNo, String nationality,
			String password) {
		
		super();
		
		this.name = name;
		this.DOB = dOB;
		this.gender = gender;
		this.panNo = panNo;
		this.salary = salary;
		this.mobNo = mobNo;
		this.nationality = nationality;
		this.password = password;
		
	}





	public long getUserId() {
		return userId;
	}





	public void setUserId(long userId) {
		this.userId = userId;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getDOB() {
		return DOB;
	}





	public void setDOB(String dOB) {
		DOB = dOB;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getPanNo() {
		return panNo;
	}





	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}





	public Double getSalary() {
		return salary;
	}





	public void setSalary(Double salary) {
		this.salary = salary;
	}





	public long getMobNo() {
		return mobNo;
	}





	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}





	public String getNationality() {
		return nationality;
	}





	public void setNationality(String nationality) {
		this.nationality = nationality;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}




}