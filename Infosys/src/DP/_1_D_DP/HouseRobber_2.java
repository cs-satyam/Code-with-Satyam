package DP._1_D_DP;

public class HouseRobber_2 {
    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(rob(a));

    }
    public static int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = robLinear(nums, 0, n - 2); // from start

        int case2 = robLinear(nums, 1, n - 1 ); // from start +1

        return Math.max(case1, case2);
    }

    static  int robLinear(int[] nums, int start, int end) {

        int n = end - start + 1;
        int[] dp = new int[n];

        dp[0] = nums[start];

        if(n>1) dp[1]=Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {

            int include = nums[start + i] + dp[i - 2];
            int exclude = dp[i - 1];

            dp[i] = Math.max(include, exclude);
        }
        return dp[n - 1];
    }
}
