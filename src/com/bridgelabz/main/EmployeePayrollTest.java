package com.bridgelabz.main;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeePayrollTest {
	   /**
     * @desc test the program
     * @params None
     * @return none
     */
	@Test
	 void testCountEntries() {
        // Arrange
        List<EmployeePayrollData> testEmployeeList = new ArrayList<>();
        testEmployeeList.add(new EmployeePayrollData(1, "John Doe", 50000.0));
        testEmployeeList.add(new EmployeePayrollData(2, "Jane Smith", 60000.0));

        EmployeePayrollService employeePayrollService = new EmployeePayrollService(testEmployeeList);

        // Act
        employeePayrollService.writeEmployeePayrollData(testEmployeeList);

        // Assert (Check if the file was created and written successfully)
        File file = new File(employeePayrollService.FILE_NAME);
        assertEquals(testEmployeeList.size(),employeePayrollService.countEntries(), 2, "Count of entries does not match.");
    }

}
