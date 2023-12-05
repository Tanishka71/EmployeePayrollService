package com.bridgelabz.main;

public class EmployeePayrollData {

	public int id;
	public String name;
	public double salary;
	
	EmployeePayrollData(int id, String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "id=" + id + ",name="+ name + '\''+ ",salary=" +salary;
		
	}
}
