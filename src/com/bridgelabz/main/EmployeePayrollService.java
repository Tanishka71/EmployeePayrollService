package com.bridgelabz.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService{

    public enum IOService {
        CONSOLE_IO,
        FILE_IO,
        DB_IO,
        REST_IO
    }
    static final String FILE_NAME="employee_payroll.txt";
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
    //<----------------------USE CASE 4------------------------------>
    /**
     * @desc Writes employee payroll data to the console.
     * @params None
     * @return None
     */
    public void writeEmployeePayrollData(List<EmployeePayrollData> employeePayrollList)
    { 
    	StringBuffer empBuffer = new StringBuffer(); employeePayrollList.forEach(employee -> { String employeeDataString = employee.toString().concat("\n"); empBuffer.append(employeeDataString); });

    try {

    Files.write(Paths.get(FILE_NAME), empBuffer.toString().getBytes());

    } catch (IOException e) {
    	 e.printStackTrace();
    }

    }
    
    /**
     * @desc Counts the number of employees in the file
     * @params None
     * @return Int (no of employees in the file)
     */
    public int countEntries() {
    	int enteries=0;
    	try {
    		enteries=(int) Files.lines(new File(FILE_NAME).toPath())
    		.count();
    	}
    	
         catch (IOException  e) {
            e.printStackTrace();
        }
    	return enteries;
    }
    
    //<----------------------USE CASE 5------------------------------>
    /**
     * @desc Print the details of each employee
     * @params None
     * @return None
     */
    public void printEmployeePayrollData() {
    	try {
    		Files.lines(new File(FILE_NAME).toPath())
    		.forEach(System.out::println);
    	}
        catch (IOException  e) {
            e.printStackTrace();
            
        }
    }
}
