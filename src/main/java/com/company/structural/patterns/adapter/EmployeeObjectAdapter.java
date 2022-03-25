package com.company.structural.patterns.adapter;

public class EmployeeObjectAdapter implements Customer{

    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDestination() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }
}
