package com.company.creational.patterns.builder;

import java.time.LocalDate;

//Abstract builder.
public interface UserDTOBuilder {

    // Methods to build "parts" of product at a time.
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthday(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    // method to "assemble" final product.
    UserDTO build();
    //(optional) ethod to fetch already built object.
    UserDTO getUserDTO();
}
