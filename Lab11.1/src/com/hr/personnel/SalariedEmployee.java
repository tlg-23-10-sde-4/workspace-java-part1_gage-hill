package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // fields
    private double salary;

    // constructors
    public SalariedEmployee() {
        super(); // a superclass conductor must be called
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // business "action" methods
    @Override
    public void pay() {
        double payment = getSalary();
        System.out.println(getName() + " is paid salary " + payment);
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + TaxPayer.SALARIED_TAX_RATE * getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation ");
    }

    // accessor "get/set" methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}