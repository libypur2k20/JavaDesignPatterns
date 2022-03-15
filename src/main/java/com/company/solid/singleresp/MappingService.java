package com.company.solid.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;

public class MappingService<T>{

    ObjectMapper mapper = new ObjectMapper();

    public T map(String objectAsString, Class<T> type) throws IOException {
        return mapper.readValue(objectAsString,type);
    }

}
