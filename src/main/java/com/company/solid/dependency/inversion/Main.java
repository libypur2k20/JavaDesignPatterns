package com.company.solid.dependency.inversion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        // Without Dependency Inversion
        Message msg = new Message("This is a message");
        MessagePrinter printer = new MessagePrinter();
        printer.writeMessage(msg,"test_msg.txt");

        // Dependency Inversion - Write to file.
        Formatter formatter = new JSONFormatter();
        try(PrintWriter writer = new PrintWriter(new FileWriter("test1_msg.txt"))) {
            printer.writeMessage(msg, formatter, writer);
        }

        // Dependency Inversion - Write to console.
        formatter = new TextFormatter();
        try(PrintWriter writer = new PrintWriter(System.out)) {
            printer.writeMessage(msg, formatter, writer);
        }

    }
}
