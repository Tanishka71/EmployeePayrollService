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
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();

        // Create an EmployeePayrollService object with the ArrayList
        EmployeePayrollService employeePayroll = new EmployeePayrollService(employeePayrollList);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read employee details from the user
        employeePayroll.readEmployeePayrollDetails(scanner);

        // Write employee payroll data to the console
        employeePayroll.writeEmployeePayrollData();
    }
}
