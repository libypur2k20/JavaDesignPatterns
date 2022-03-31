package com.company.structural.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight factory. Returns shared flyweight based on key.
public class ErrorMessageFactory {

    // This serves as key for getting flyweight instance.
    public enum ErrorType {
        GenericSystemError,
        PageNotFoundError,
        ServerError
    }

    private Map<ErrorType,SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {

        errorMessages.put(ErrorType.ServerError,
                new SystemErrorMessage("A server error of type $errorCode occurred. Please refer to:\n",
                        "http://google.com/q="));
        errorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not found. An error of type $errorCode occurred. Please refer to:\n",
                        "http://google.com/q="));
        errorMessages.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("A generic error of type $errorCode occurred. Please refer to:\n",
                        "http://google.com/q="));

    }

    private static class StaticFactoryInstance{
        private static ErrorMessageFactory INSTANCE = new ErrorMessageFactory();
    }

    public static ErrorMessageFactory getInstance(){
        return StaticFactoryInstance.INSTANCE;
    }

    public SystemErrorMessage getError(ErrorType type){
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId){
        return new UserBannedErrorMessage(caseId);
    }
}
