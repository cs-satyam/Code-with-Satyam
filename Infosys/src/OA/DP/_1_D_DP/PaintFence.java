package OA.DP._1_D_DP;

public class PaintFence {
    public static void main(String[] args) {
        int n=3;
        int k=4;

        System.out.println(  paint(n,k));
    }
    static int paint(int n,int k){
        if(n==1) return k;
        int dp[]= new int[n+1];
        dp[1]=k;
        dp[2]=k+k*(k-1);
        for(int i=3;i<=n;i++){
            int same = dp[i-2]*(k-1);
            int diff= dp[i-1]* (k-1);
            dp[i]=same+diff;

        }
        return dp[n];
    }
}
