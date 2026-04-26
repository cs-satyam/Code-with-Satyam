package Stacks;

import java.util.Stack;

public class reverseStack {

    static void pushAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }

        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

    static void reversestack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        reversestack(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reversestack(s);

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}

class reverseStackUsingStack {
    static void reversestack(Stack<Integer> st) {
        Stack<Integer> stack = new Stack<>();
        if (st.isEmpty()) {
            return;
        }
       while (!st.isEmpty()) {
           stack.push(st.pop());

       }
       while (!stack.isEmpty()) {
           System.out.println(stack.pop());
       }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reversestack(s);

    }
}



