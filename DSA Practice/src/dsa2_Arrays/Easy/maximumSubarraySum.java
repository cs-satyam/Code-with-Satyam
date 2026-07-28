package dsa2_Arrays.Easy;

public class maximumSubarraySum {
    static int maxSubarraySum(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int currentSum = 0;
            for(int j = i; j < n; j++){
                currentSum += arr[j];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }

    return maxSum;
    }
    public static void main(String[] args) {
        int a[]={1,-2,6,-1,3};
        int n=a.length;
     int r=   maxSubarraySum(a,n);
        System.out.println(r);
    }
}
