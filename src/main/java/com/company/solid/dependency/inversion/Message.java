package com.company.solid.dependency.inversion;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {

    private String msg;

    private LocalDateTime timestamp;

    public Message(String message){
        this.msg = message;
        this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
    }

    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}
