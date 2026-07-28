package DP;

import java.util.*;

class coinChange {

    public static int coinchange(int[] coins, int amt) {

        int[] dp = new int[amt + 1];
        Arrays.fill(dp, amt + 1);

        System.out.println("Initial DP array: " + Arrays.toString(dp));

        dp[0] = 0;

        for (int i = 1; i <= amt; i++) {

            System.out.println("\n---- Calculating dp[" + i + "] ----");

            for (int coin : coins) {

                System.out.println("Checking: coin (" + coin + ") <= " + i);

                if (coin <= i) {

                    int candidate = 1 + dp[i - coin];

                    System.out.println(
                            "✔ TRUE → coin = " + coin +
                                    ", dp[" + (i - coin) + "] = " + dp[i - coin] +
                                    " → candidate = " + candidate
                    );

                    dp[i] = Math.min(dp[i], candidate);

                } else {
                    System.out.println("✘ FALSE → skip");
                }
            }

            System.out.println("Final dp[" + i + "] = " + dp[i]);
            System.out.println("DP now: " + Arrays.toString(dp));
        }

        System.out.println("\nFinal DP Array: " + Arrays.toString(dp));

        return dp[amt] > amt ? -1 : dp[amt];
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amt = 5;

        int result = coinchange(coins, amt);

        System.out.println("\nAnswer: " + result);
    }
}