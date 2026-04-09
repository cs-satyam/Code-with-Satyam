package dsa2_Arrays;

public class MaxConsecutiveOnes  {
    static int leetcode485(int[] arr){
        int n = arr.length;
        int count = 0;
        int maxcount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            } else {
                count = 0;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int a[] = {1,1,0,1,1,1};
        int result = leetcode485(a);
        System.out.println("max consecutive ones: " + result);
    }
}