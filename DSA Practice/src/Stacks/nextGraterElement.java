package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class nextGraterElement {
    public static void main(String[] args) {
        int arr[]={6 ,8,0,1,3};
        int n = arr.length;
        int nxtele[]= new int[n];
        Arrays.fill(nxtele,-1);   // reverse the comment


        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){ // reverse the comment
//            if(st.isEmpty()){
//                nxtele[i]=-1;
//            }else{
                nxtele[i]=st.peek();
            }
            st.push(arr[i]);

        }
        for(int i:nxtele){
            System.out.print(i+" ");
        }
    }
}
