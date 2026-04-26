package Stacks;
import java.util.*;
public class reverseStringUsingStack {
        public String reverse(String S) {
            Stack<Character> s = new Stack<>();

            for (char i : S.toCharArray()) {
                s.push(i);
            }

            StringBuilder reversed = new StringBuilder();

            while (!s.isEmpty()) {
                reversed.append(s.pop());
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            reverseStringUsingStack obj = new reverseStringUsingStack();

            String str = "Satyam";
            String result = obj.reverse(str);

            System.out.println("Original String: " + str);
            System.out.println("Reversed String: " + result);
        }
    }

