package com.company.structural.patterns.adapter;

public class BusinessCardDesigner {

    public static String designCard(Customer customer){
        return "Name: " + customer.getName() + "\n"
        + "Destination: " + customer.getDestination() + "\n"
        + "Address: " + customer.getAddress();
    }

    public static void main(String[] args) {

        /** Using Class/Two-way adapter **/
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter("Miguel","Diaz","Senior Dev","Vespucijeva");
        String classCardInfo = BusinessCardDesigner.designCard(classAdapter);
        System.out.println("CLASS ADAPTER CARD:\n" + classCardInfo);

        /** Using Object Adapter **/
        Employee employee = new Employee("Aleksandra","Misic","Graphics Designer","Dostojeskog");
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String objectCardInfo = BusinessCardDesigner.designCard(objectAdapter);
        System.out.println("OBJECT ADAPTER CARD:\n" + objectCardInfo);
    }
}
