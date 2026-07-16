package DP.Knapsack0_1;

import java.util.*;
public class targetSum {
    public static void main(String[] args) {

        int nums[] = {1,1,1,1,1};
        int target = 3;
        int sum = 0;
        for (int x : nums)
            sum += x;

        // Impossible cases
        if (Math.abs(target) > sum)
            System.out.println(0);

        if ((sum + target) % 2 != 0)
            System.out.println(0);

        int subsetSum = (sum + target) / 2;

        int[][] dp = new int[nums.length][subsetSum + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int r= countWays(0,nums, subsetSum, dp);
        System.out.println(r);
    }
    static int countWays(int i, int nums[],int target,int dp[][]){
        if(i == nums.length){
            return target==0?1:0;
        }
        int notTake=countWays(i+1,nums,target,dp);
        int take=0;
        if(nums[i]<=target){
            take =countWays(i+1,nums,target-nums[i],dp);
        }
        return dp[i][target]= take+notTake;
    }
}