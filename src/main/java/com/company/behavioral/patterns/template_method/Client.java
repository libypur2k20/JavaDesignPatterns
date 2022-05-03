package com.company.behavioral.patterns.template_method;


import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {

        Order order = new Order("1001");

        order.addItem("Soda",2.50);
        order.addItem("Sandwich",11.95);
        order.addItem("Pizza",15.95);

        // Print as plain text.
        OrderPrinter printer = new TextPrinter();
        String filename = order.getId() + ".txt";
        printer.printOrder(order,filename);

        // Print as html document.
        printer = new HtmlPrinter();
        filename = order.getId() + ".html";
        printer.printOrder(order,filename);

    }
}
