package com.company.creational.patterns.builder.inner;

import com.company.creational.patterns.builder.Address;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args){

        UserDTO userDTO = buildUserDto(UserDTO.getBuilder(), createUser());
        System.out.println(userDTO);
    }

    private static UserDTO buildUserDto(UserDTO.UserDTOBuilder builder, User user ){

        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAddress(user.getAddress())
                .withBirthday(user.getBirthday())
                .build();

    }

    private static User createUser(){
        User user = new User();
        user.setFirstName("Miguel");
        user.setLastName("Díaz Pestana");
        user.setBirthday(LocalDate.of(1971,7,27));
        Address address = new Address();
        address.setHouseNumber("66");
        address.setStreet("Cmno. La Travesía");
        address.setCity("Breña Alta");
        address.setState("Santa Cruz de Tenerife");
        address.setZipcode("38710");
        user.setAddress(address);
        return user;
    }
}
