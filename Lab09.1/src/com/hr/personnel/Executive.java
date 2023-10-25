package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class Executive extends SalariedEmployee implements TaxPayer {

    // constructors
    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    // business "action" methods
    @Override
    public void work() {
        System.out.println(getName() + " is away on vacation");
    }
}