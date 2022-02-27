package com.mphasis.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String name;
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	private double salary;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
