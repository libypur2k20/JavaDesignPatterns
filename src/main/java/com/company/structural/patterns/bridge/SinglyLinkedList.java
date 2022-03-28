package com.company.structural.patterns.bridge;

// A concrete implementor.
// This implementation is a classic LinkedList using nodes.
// ** NOT thread safe **
public class SinglyLinkedList<T> implements LinkedList<T> {

    private class Node{
        private Object data;
        private Node next;

        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node top;
    private Node last;

    @Override
    public void addFirst(T element) {

        if (top == null){
            top = last = new Node(element, null);
        }
        else{
            top = new Node(element, top);
        }
        size++;

    }

    @Override
    public T removeFirst() {

        if (top == null){
            return null;
        }

        @SuppressWarnings("unchecked")
        T temp = (T)top.data;

        if (top.next == null){
            top = last = null;
        }
        else{
            top = top.next;
        }

        size--;
        return temp;


    }

    @Override
    public void addLast(T element) {

        if (last == null){
            this.addFirst(element);
        }
        else{
            last.next = new Node(element,null);
            last = last.next;
            size++;
        }

    }

    @Override
    public T removeLast() {
        if (last == null){
            return null;
        }
        else{
            T temp;
            if (top == last){
                temp = (T)top.data;
                top = last = null;
            }
            else{
                Node tmpNode = top;
                while(tmpNode.next != last){
                    tmpNode = tmpNode.next;
                }
                temp = (T)last.data;
                last = tmpNode;
                last.next = null;
            }

            size--;
            return temp;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }


    @Override
    public String toString() {
        String result = "[";
        Node temp = top;
        while(temp!=null) {
            result += temp.data + (temp.next == null?"":", ");
            temp = temp.next;
        }
        result += "]";
        return result;
    }
}
