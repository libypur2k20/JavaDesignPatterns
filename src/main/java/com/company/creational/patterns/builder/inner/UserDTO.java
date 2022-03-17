package com.company.creational.patterns.builder.inner;

import com.company.creational.patterns.builder.Address;

import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + "\nage=" + age + "\naddress=" + address;
    }

    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder{

        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private Address address;

        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withAddress(Address address){
            this.address = address;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date){
            this.birthDate = date;
            return this;
        }

        public UserDTO build(){
            this.userDTO = new UserDTO();
            this.userDTO.setName(this.firstName + " " + this.lastName);
            this.userDTO.setAddress(this.address.toString());
            this.userDTO.setAge(Integer.toString(Period.between(LocalDate.now(), this.birthDate).getYears()));
            return this.userDTO;
        }

        public UserDTO getUserDTO(){
            return this.userDTO;
        }

    }
}
