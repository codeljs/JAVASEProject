package com.test;

import com.test.collection.ArrayList;
import com.test.collection.LinkedList;
import com.test.collection.LinkedQueue;
import com.test.collection.LinkedStack;
public class Main {

    public static void main(String[] args) {
        LinkedQueue<String> stack = new LinkedQueue<>();
        stack.offer("AAA");
        stack.offer("BBB");
        stack.offer("CCC");
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
    }
}