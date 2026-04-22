package dsa2_Arrays.Medium;

public class maximumSubarraySum {
    static int kaddanes(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < n; i++){
            currSum += arr[i];
            if(currSum <0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=a.length;
        int r=   kaddanes(a,n);
        System.out.println(r);
    }
}
