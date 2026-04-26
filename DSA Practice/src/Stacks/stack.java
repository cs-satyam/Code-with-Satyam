package Stacks;

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        if (!s.isEmpty()) {
            System.out.println("peek element: " + s.peek());
        } else {
            System.out.println("Stack is empty");
        }

        s.push(1);
        s.push(2);
        System.out.println("peek element: " + s.peek());

        s.push(3);
        System.out.println("peek element: " + s.peek());
    }
}