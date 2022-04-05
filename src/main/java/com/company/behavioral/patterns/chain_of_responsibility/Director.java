package com.company.behavioral.patterns.chain_of_responsibility;

// A concrete handler
public class Director extends Employee{

    public Director(){
        super("Director",null);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.Type.PTO){
            application.approve(this.getApproverRole());
            return true;
        }
        return false;
    }
}
