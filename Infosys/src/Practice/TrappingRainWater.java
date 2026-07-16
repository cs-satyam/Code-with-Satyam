package Practice;
import java.util.*;

public class TrappingRainWater
{
    public static void main(String[] args) {
        int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }
    static  int trap(int a[]){
        int n = a.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], a[i]);
        }

        rightMax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);
        }

        // Debug prints for arrays
        System.out.println("LeftMax array: " + Arrays.toString(leftMax));
        System.out.println("RightMax array: " + Arrays.toString(rightMax));

        int water = 0;
        for (int i = 0; i < n; i++) {
            int trapped = Math.min(leftMax[i], rightMax[i]) - a[i];
            water += trapped;

            // Debug print for each index
            System.out.println("Index " + i + " | leftMax=" + leftMax[i] +
                    ", rightMax=" + rightMax[i] +
                    ", height=" + a[i] +
                    ", trapped=" + trapped +
                    ", water=" + water);
        }

        return water;
    }
}
