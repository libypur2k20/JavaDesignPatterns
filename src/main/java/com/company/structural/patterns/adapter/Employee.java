package com.company.structural.patterns.adapter;

/**
 * An existing class used by our system
 * Adaptee
 */
public class Employee {

    private String firstName, lastName;
    private String jobTitle;
    private String officeLocation;

    public Employee(String firstName, String lastName, String jobTitle, String officeLocation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.officeLocation = officeLocation;
    }


    public String getFullName(){
        return firstName + " " + lastName;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public String getOfficeLocation(){
        return officeLocation;
    }
}
