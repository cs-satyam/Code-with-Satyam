package DP.Knapsack0_1;

public class Knapsack01_recurssion {

    public static void main(String[] args) {

        int[] wt = {1, 3, 4, 5};     // Weights
        int[] val = {1, 4, 5, 7};    // Values
        int capacity = 7;

        int ans = knapsack(wt, val, capacity,wt.length);

        System.out.println("Maximum Profit = " + ans);
    }

    static int knapsack(int[] wt, int[] val, int capacity, int n) {

        if(capacity==0||n==0){
            return 0;

        }
        if(wt[n-1]<=capacity){
            int include=val[n-1]+knapsack(wt,val,capacity-wt[n-1],n-1);
            int exclude= knapsack(wt,val,capacity,n-1);
            return Math.max(include,exclude);
        }else{
            return knapsack(wt,val,capacity,n-1);
        }

    }
}