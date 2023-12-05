package com.bridgelabz.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList=new ArrayList<>();
		EmployeePayrollService employeePayroll=new EmployeePayrollService(employeePayrollList);
		Scanner scanner=new Scanner(System.in);
		employeePayroll.readEmployeePayrollDetails(scanner);
		employeePayroll.writeEmployeePayrollData();
	}

}
