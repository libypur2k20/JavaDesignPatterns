package com.company.solid.dependency.inversion;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONFormatter implements Formatter {

    public String format(Message message) throws FormatException{
        ObjectMapper mapper = new ObjectMapper();
        try{
            return mapper.writeValueAsString(message);
        }
        catch(JsonProcessingException e){
            e.printStackTrace();
            throw new FormatException(e);
        }
    }
}
