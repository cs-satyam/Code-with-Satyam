package OA.DP.Unbounded_Knapsack;

public class rodCutting {
    public static void main(String[] args) {
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 8;

        System.out.println(maxSell(0, n, price));
    }
    static int maxSell(int i, int n, int price[]) {

            if (i == price.length || n == 0)
                return 0;

            int notTake = maxSell(i + 1, n, price);

            int take = 0;
            if (i + 1 <= n) {
                take = price[i] + maxSell(i, n - (i + 1), price);
            }

            return Math.max(take, notTake);

    }
}

