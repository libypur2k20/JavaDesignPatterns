package com.company.behavioral.patterns.command;

public class SendCommand implements Command{

    private final EWSService service;
    private final String[] mailingList;
    private final String content;

    public SendCommand(EWSService service, String[] mailingList, String content){

        this.service = service;
        this.mailingList = mailingList;
        this.content = content;
    }

    @Override
    public void execute() {
        service.sendEmail(mailingList,content);
    }

}
