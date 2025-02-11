package com.springmvc.model;

public class Employee {
	
	private int id;
	private String ename;
	private String ecity;
	private double esalary;
	public Employee() {
		super();
	}
	public Employee(int id, String ename, String ecity, double esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.ecity = ecity;
		this.esalary = esalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", ecity=" + ecity + ", esalary=" + esalary + "]";
	}
	
	

}
