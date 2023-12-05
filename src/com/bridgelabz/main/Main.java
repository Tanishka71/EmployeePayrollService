package com.bridgelabz.main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @desc Main method to demonstrate EmployeePayrollService functionality.
     *       Reads employee details, adds them to a list, and then writes the
     *       payroll data to the console.
     * @params args - Command line arguments (not used in this program).
     * @return None
     */
    public static void main(String[] args) {
        // Create an ArrayList to store EmployeePayrollData objects
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>(); EmployeePayrollService payrollService = new EmployeePayrollService(employeePayrollList);

        Scanner scanner = new Scanner(System.in);

        char choice;
        do {
            payrollService.readEmployeePayrollDetails(scanner);
            System.out.println("Do you want to add another employee? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        // Write employee payroll to file
        payrollService.writeEmployeePayrollData(employeePayrollList);
        payrollService.printEmployeePayrollData();
        int noOfEmployees=payrollService.countEntries();
        System.out.println("The number of employees in the file are : "+noOfEmployees);
    }
}
