package CRT;

import java.util.Arrays;

public class LC_2344 {

    public static void main(String[] args) {

        int nums[] = {2,3,2,4,3};
        int numsDivide[] = {9,6,9,3,15};

        int r = minOperations(nums, numsDivide);

        System.out.println(r);
    }

    private static int minOperations(int[] nums, int[] numsDivide) {

        int gcdValue = numsDivide[0];

        for (int i = 1; i < numsDivide.length; i++) {
            gcdValue = gcd(gcdValue, numsDivide[i]);
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (gcdValue % nums[i] == 0) {
                return i;
            }
        }

        return -1;
    }
    private static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}