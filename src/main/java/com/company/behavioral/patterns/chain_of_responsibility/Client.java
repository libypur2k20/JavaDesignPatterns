package com.company.behavioral.patterns.chain_of_responsibility;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args){

        LeaveApprover leaveApprover = new ProjectLead(new Manager(new Director()));

        LeaveApplication leaveApplication = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .withFrom(LocalDate.now())
                .withTo(LocalDate.now().plusDays(4))
                .build();

        leaveApprover.processLeaveApplication(leaveApplication);

        System.out.println(leaveApplication);

    }
}
