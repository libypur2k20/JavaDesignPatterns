package com.company.solid.dependency.inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class MessagePrinter {

    //Using encapsulated dependencies.
    public void writeMessage(Message msg, String fileName) throws IOException {
        Formatter formatter = new JSONFormatter(); //creates formatter
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            writer.println(formatter.format(msg));
            writer.flush();
        }
    }

    // Using Dependency Inversion
    public void writeMessage(Message msg, Formatter formatter, PrintWriter writer) throws IOException{
        writer.println(formatter.format(msg));
        writer.flush();
    }
}
