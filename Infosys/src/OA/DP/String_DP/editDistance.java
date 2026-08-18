package OA.DP.String_DP;

import java.util.Arrays;

public class editDistance {
    public static void main(String[] args) {
        String s ="horse";
        String t = "ros";

        System.out.println(lcs(s,t));

    }
     static int  lcs(String s,String t){
        int n=s.length();
        int m=t.length();
        int dp[][]= new int[n+1][m+1];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return f(n-1,m-1,s,t,dp);
     }

    private static int f(int i, int j, String s, String t, int[][] dp) {
        if (i < 0) return j + 1;
        if (j < 0) return i + 1;;
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            dp[i][j] = f(i-1,j-1,s,t,dp);
        }else{
            dp[i][j]= Math.min(1+f(i-1,j,s,t,dp),
                          Math.min(1+f(i,j-1,s,t,dp), 1+f(i-1,j-1,s,t,dp)));


        }
        return dp[i][j];
    }

}
