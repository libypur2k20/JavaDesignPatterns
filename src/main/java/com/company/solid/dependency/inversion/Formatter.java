package com.company.solid.dependency.inversion;

public interface Formatter {

    public String format(Message message) throws FormatException;
}
