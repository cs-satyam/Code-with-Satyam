class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, target, 0, 0);
    }
    public int solve(int arr[], int target, int i, int currSum){
        if(i==arr.length){
            if(currSum==target){
                return 1;
            }else{
                return 0;
            }
        }
        int pos=solve(arr, target, i+1, currSum+arr[i]);
        int neg=solve(arr, target, i+1, currSum-arr[i]);

        return pos+neg;
    }
}