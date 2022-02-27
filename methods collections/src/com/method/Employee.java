package com.method;

public class Employee {
	private int eid;
	private String enmae;
	private double salary;
	private String ename;
	public Employee() {
		
	}
	public Employee(int eid, String enmae, double salary) {
		super();
		this.eid = eid;
		this.enmae = enmae;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnmae() {
		return enmae;
	}
	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Employee [eid=" +eid +",ename=" +ename +",salary="+salary+"]";
		
	}

}