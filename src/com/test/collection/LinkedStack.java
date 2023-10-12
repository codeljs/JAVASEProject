package com.test.collection;

import java.util.NoSuchElementException;

public class LinkedStack <E>{
    private final Node<E> head = new Node<>(null);
    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element){
             this.element = element;
        }
    }

    public void push(E element){
        Node<E> newNode = new Node<>(element);
        newNode.next = head.next;
        head.next = newNode;
    }

    public E pop(){
        if(head.next == null)
            throw new NoSuchElementException("Stack is empty!");
        E result = head.next.element;
        head.next = head.next.next;
        return result;
    }


}
