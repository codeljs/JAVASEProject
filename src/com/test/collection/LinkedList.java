package com.test.collection;

public class LinkedList<E> {
    private final Node<E> head = new Node<>(null);
    private int size = 0;

    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element){
            this.element = element;
        }
    }

    public void add(E element, int index){
        if(index<0 || index >size){
            throw new IndexOutOfBoundsException("Index must between 0 - "+ (size));
        }

        Node<E> prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }
        Node<E> newNode = new Node<>(element);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    public E remove(int index){
        if(index<0 || index >size-1){
            throw new IndexOutOfBoundsException("Index must between 0 - "+ (size-1));
        }
        Node<E> prev = head;
        for(int i = 0; i<index ; i++){
            prev = prev.next;
        }
        E res = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return res;
    }

    public E get(int index){
        if(index<0 || index >size-1){
            throw new IndexOutOfBoundsException("Index must between 0 - "+ (size-1));
        }
        Node<E> tmp = head;
        for (int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.element;


    }

    public int size(){
        return  size;
    }



    @Override
    public String toString(){
        StringBuilder buider = new StringBuilder();
        Node<E> node = head.next;
        while (node != null){
            buider.append(node.element).append(" ");
            node = node.next;
        }
        return buider.toString();
    }



}
