package com.bridgelabz.main;

import java.io.Serializable;

public class EmployeePayrollData implements Serializable {

    // Fields to store employee data
    public int id;
    public String name;
    public double salary;

    /**
     * Constructor to initialize EmployeePayrollData object with given values.
     *
     * @param id     - Employee ID.
     * @param name   - Employee name.
     * @param salary - Employee salary.
     */
    EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns a string representation of the EmployeePayrollData object.
     *
     * @return String - Formatted string containing employee details.
     */
    public String toString() {
        return "id=" + id + " name=" + name + '\'' + ", salary=" + salary;
    }
}
