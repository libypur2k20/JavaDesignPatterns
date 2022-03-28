package com.company.structural.patterns.bridge;

// A concrete implementor.
// This implementation uses arrays to implement LinkedList.
// Please note, code below is quickly thrown together and
// lacks many checks and fixes to make it truly usable.
// ** NOT thread safe
public class ArrayLinkedList<T> implements LinkedList<T>{

    private static final int DEFAULT_SIZE = 2;
    private Object[] data;
    private int size;


    public ArrayLinkedList(){
        data = new Object[DEFAULT_SIZE];
    }


    @Override
    public void addFirst(T element) {

        ensureCapacity(++size);
        shiftOneRight();
        data[0] = element;

    }

    @Override
    public T removeFirst() {
        if (size == 0){
            return null;
        }
        @SuppressWarnings("unchecked")
        T temp = (T)data[0];
        shiftOneLeft();
        size--;
        return temp;
    }

    @Override
    public void addLast(T element) {

        ensureCapacity(++size);
        data[size - 1] = element;
    }

    @Override
    public T removeLast() {

        @SuppressWarnings("unchecked")
        T temp = (T)data[size - 1];
        data[size--] = null;
        return temp;
    }


    private void ensureCapacity(int newSize){

        if (data.length > newSize){
            return;
        }

        Object[] temp = new Object[data.length + DEFAULT_SIZE];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }


    private void shiftOneLeft(){
        System.arraycopy(data,1,data,0, size);
    }


    private void shiftOneRight(){
        System.arraycopy(data,0,data,1,size);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        String result = "[";
        for(int i=0;i<size;i++) {
            result += data[i] + (i==size-1?"":", ");
        }
        result+="]";
        return result;
    }

}
