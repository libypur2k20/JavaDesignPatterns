package com.company.structural.patterns.bridge;

public class Client {

    public static void main(String[] args){

        FifoCollection<Integer> nodeCollection = new Queue<>(new SinglyLinkedList<>());

        nodeCollection.offer(10);
        nodeCollection.offer(20);
        nodeCollection.offer(30);

        System.out.println(nodeCollection);

        int polled = nodeCollection.poll();

        System.out.println("Polled: " + polled);

        nodeCollection.offer(40);

        System.out.println(nodeCollection);
    }
}
