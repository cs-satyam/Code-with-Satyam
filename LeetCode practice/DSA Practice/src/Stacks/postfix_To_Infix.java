package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class postfix_To_Infix {

    static String postfixToInfix(String postfix) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(c)) {
                st.push(String.valueOf(c));
            }
            // Operator
            else {
                String op2 = st.pop();
                String op1 = st.pop();

                String exp = "(" + op1 + c + op2 + ")";
                st.push(exp);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter postfix expression: ");
        String postfix = sc.nextLine();

        System.out.println("Infix Expression: " + postfixToInfix(postfix));

        sc.close();
    }
}