package com.company.creational.patterns.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

    private UserWebDTO userWebDTO;

    private String firstName;
    private String lastName;
    private Address address;
    private String age;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public UserDTO build() {
        String name = firstName + " " + lastName;
        String strAddress = (address != null ? address.toString() : "");
        userWebDTO = new UserWebDTO(name,strAddress, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }
}
