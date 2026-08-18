package OA.DP._1_D_DP;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=5;
        System.out.println(climb(n));
    }
    static int climb(int n){
        if(n<=3) return n;
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
