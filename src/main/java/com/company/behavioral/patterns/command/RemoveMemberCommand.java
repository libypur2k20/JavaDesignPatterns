package com.company.behavioral.patterns.command;

public class RemoveMemberCommand implements Command{

    private final EWSService service;
    private final String emailAddress;
    private final String listName;

    public RemoveMemberCommand(EWSService service, String emailAddress, String listName){

        this.service = service;
        this.emailAddress = emailAddress;
        this.listName = listName;
    }

    @Override
    public void execute() {
        service.removeMember(emailAddress, listName);
    }

}
