package com.bridgelabz.main;

import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public enum IOService {
        CONSOLE_IO,
        FILE_IO,
        DB_IO,
        REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }
  //<----------------------USE CASE 1------------------------------>
    /**
     * @desc Reads employee details from the user input using Scanner.
     * @params scanner - Scanner object for user input.
     * @return None
     */
    public void readEmployeePayrollDetails(Scanner scanner) {
        System.out.println("Enter employee id:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /**
     * @desc Writes employee payroll data to the console.
     * @params None
     * @return None
     */
    public void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll to Console\n" + employeePayrollList);
    }
}
