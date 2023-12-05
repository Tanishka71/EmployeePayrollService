package com.bridgelabz.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService{

    public enum IOService {
        CONSOLE_IO,
        FILE_IO,
        DB_IO,
        REST_IO
    }
    private static final String FILE_NAME="employee_payroll.txt";
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
    	  try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
              objectOutputStream.writeObject(employeePayrollList);
              System.out.println("Employee payroll data written to file successfully.");
          } catch (IOException e) {
              e.printStackTrace();
          }
    }
    
    /**
     * @desc Counts the number of employees in the file
     * @params None
     * @return Integer (no of employees in the file)
     */
    public int countEntries() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<EmployeePayrollData> storedData = (List<EmployeePayrollData>) objectInputStream.readObject();
            return storedData.size();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
