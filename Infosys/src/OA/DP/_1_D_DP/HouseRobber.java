package OA.DP._1_D_DP;

public class HouseRobber {
    public static void main(String[] args) {
        int a[]={5,15,6,20,22};
        System.out.println(rob(a));
    }
    static int rob(int nums[]){
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i <n; i++) {
            int include = dp[i - 2] + nums[i];
            int exclude = dp[i - 1];
            dp[i] = Math.max(include, exclude);
        }

        return dp[n-1];
    }
}
