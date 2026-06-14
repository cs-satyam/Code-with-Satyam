package Stacks;

import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]= new int[stock.length];
        stockspan(stock,span);
        for(int i:span){
            System.out.print(i+" ");
        }
    }
    static void stockspan(int stock[],int span[]){
        Stack<Integer> st=new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<stock.length;i++){
            int curPrice=stock[i];
            while(!st.isEmpty()&& curPrice>=stock[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh=st.peek();
                span[i]=i-prevHigh;
            }
            st.push(i);
        }



    }
}
