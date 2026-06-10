package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s="a*(b+c)/d";

        System.out.println(intoPostfix(s));
    }
    public static String intoPostfix(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();



        return sb.toString();
    }
}
