class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int l = 1;
        int h = 0;
        for (int x : nums) {
            h = Math.max(h, x);
        }

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (f(nums, mid) > threshold) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return l;

    }
    int f(int arr[], int mid){
        int x=0;
        for(int i:arr){
            x+=(i+mid-1)/mid;
        }
        return x;
    }
}