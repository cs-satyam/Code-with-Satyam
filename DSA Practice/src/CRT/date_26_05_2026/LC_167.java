package CRT.date_26_05_2026;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class LC_167 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    private static int[] twoSum(int[] a, int t) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {

            int sum = a[i] + a[j];

            if (sum == t) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum > t) {
                j--;
            }
            else {
                i++;
            }
        }

        return new int[]{-1, -1};
    }
}