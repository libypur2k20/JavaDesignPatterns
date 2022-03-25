package com.company.structural.patterns.adapter;

/**
 * A class adapter, works as Two-way adapter
 */
public class EmployeeClassAdapter extends Employee implements Customer{


    public EmployeeClassAdapter(String firstName, String lastName, String jobTitle, String officeLocation) {
        super(firstName, lastName, jobTitle, officeLocation);
    }

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDestination() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
