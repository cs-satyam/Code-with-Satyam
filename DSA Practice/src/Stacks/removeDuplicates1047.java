package Stacks;

import java.util.Stack;

public class removeDuplicates1047
{
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s)
    {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));

            }else{
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }

            }
        }
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }

        return sb.reverse().toString();
    }
}
