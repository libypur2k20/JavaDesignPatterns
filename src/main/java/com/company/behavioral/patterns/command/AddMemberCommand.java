package com.company.behavioral.patterns.command;

// A concrete implementation of Command.
public class AddMemberCommand implements Command{


    private final EWSService service;
    private final String emailAddress;
    private final String listName;

    public AddMemberCommand(EWSService service, String emailAddress, String listName){

        this.service = service;
        this.emailAddress = emailAddress;
        this.listName = listName;
    }

    @Override
    public void execute() {
        if (service != null){
            service.addMember(emailAddress, listName);
        }
    }

}
