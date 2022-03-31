package com.company.structural.patterns.flyweight;

public class Client {

    public static void main(String[] args){

        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));

        System.out.println("************************************************************");

        ErrorMessage userBannedMsg = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
        System.out.println(userBannedMsg.getText(null));

    }
}
