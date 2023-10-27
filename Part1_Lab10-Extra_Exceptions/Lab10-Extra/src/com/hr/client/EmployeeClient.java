package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Gage");
        try {
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e);
            System.out.println(e.getCause()); // extracts the nested cause
            e.printStackTrace();
        }
    }
}