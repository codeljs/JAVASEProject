package com.test.collection;

public class ArrayList <E> {
    int capacity = 10;
    int size = 0; // current size
    private Object[] array = new Object[capacity];

    public void add(E element, int index){
        if(index <0 || index > size) {
            throw new IndexOutOfBoundsException("only add between 0 - " + index);
        }
        if(capacity == size){
            int newCapacity = capacity + (capacity >> 1);
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;
            capacity = newCapacity;
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = element;
        size++;
    }

    public E remove(int index){
        if(index < 0 || index > size-1){
            throw new IndexOutOfBoundsException("index must between 0 - "+ (size-1));
        }
        E e = (E)array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i+1];
        }
        size--;
        return e;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<size;i++ ) {builder.append(array[i]).append(" ");}
        return builder.toString();
    }


    public E get(int index){
        if(index < 0 || index > size-1){
            throw new IndexOutOfBoundsException("index must between 0 - "+ (size-1));
        }
        return (E)array[index];


    }

    public int size(){
        return size;
    }



}
