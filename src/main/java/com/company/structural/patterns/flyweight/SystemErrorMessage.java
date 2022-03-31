package com.company.structural.patterns.flyweight;

// A concrete Flyweight. Instance is shared.
public class SystemErrorMessage implements ErrorMessage {

    // Intrinsic state.
    // some error message $errorCode
    private String messageTemplate;
    // Intrinsic state.
    //http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }


    /**
     * We get extrinsic state from method argument.
     * @param code
     * @return
     */
    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode",code) + helpUrlBase + code;
    }

}
