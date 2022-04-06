package com.company.behavioral.patterns.command;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        EWSService service = new EWSService();
        Command c1 = new AddMemberCommand(service,"a@a.com","spam");
        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand(service,"b@b.com","spam");
        MailTasksRunner.getInstance().addCommand(c2);

        // Give MailTaskRunner instance some time to finish commands execution.
        Thread.sleep(3000);

        MailTasksRunner.getInstance().shutdown();

    }
}
