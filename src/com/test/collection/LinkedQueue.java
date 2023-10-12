package com.test.collection;

import java.util.NoSuchElementException;

public class LinkedQueue <E>{
    private final LinkedQueue.Node<E> head = new LinkedQueue.Node<>(null);
    private static class Node<E>{
        E element;
        LinkedQueue.Node<E> next;

        public Node(E element){
            this.element = element;
        }
    }


    public void offer(E element){
        Node<E> last = head;
        while(last.next != null)last = last.next;
        last.next = new Node<>(element);
    }
    public E poll(){
        if(head.next == null)throw new NoSuchElementException("Queue is empty!");
        E element = head.next.element;
        head.next = head.next.next;
        return element;
    }
}
