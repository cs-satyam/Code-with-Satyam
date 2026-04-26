package Stacks;

import java.util.*;

public class pushAtBottom {

    static void pushatbottom(Stack<Integer> st, int a) {
        if (st.isEmpty()) {
            st.push(a);
            return;
        }

        int top = st.pop();
        pushatbottom(st, a);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushatbottom(stack, 4);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}