package Graph;

import java.util.*;

public class inputGraph {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        // Example: [[1,2,3],[4,5,6],[7,8,9]]

        // remove outer brackets
        s = s.substring(2, s.length() - 2);

        // split rows
        String[] rows = s.split("\\],\\[");

        int n = rows.length;
        int m = rows[0].split(",").length;

        int[][] arr = new int[n][m];

        // fill array
        for (int i = 0; i < n; i++) {
            String[] nums = rows[i].split(",");

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(nums[j]);
            }
        }

        // print matrix
        for (int[] r : arr) {
            System.out.println(Arrays.toString(r));
        }

        sc.close();
    }
}