/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 15.00, 40.00));
        dept.addEmployee(new HourlyEmployee("Gage", LocalDate.of(2020, 11, 10), 35.00, 30.00));
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 1175.00));
        dept.addEmployee(new SalariedEmployee("Elizabeth", LocalDate.of(2023, 10, 10), 2700.00));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // make its Employees pay
        System.out.println("\nMake employees pay:");
        dept.payEmployees();
    }
}