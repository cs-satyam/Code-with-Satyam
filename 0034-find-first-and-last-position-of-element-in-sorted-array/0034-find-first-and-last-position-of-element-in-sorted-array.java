class Solution {

    static int findLowerBound(int[] a, int k) {
        int l = 0, r = a.length - 1;
        int ans = a.length;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] >= k) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    static int findUpperBound(int[] a, int k) {
        int l = 0, r = a.length - 1;
        int ans = a.length;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (a[mid] > k) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int lb = findLowerBound(nums, target);

        if (lb == nums.length || nums[lb] != target)
            return new int[]{-1, -1};

        int ub = findUpperBound(nums, target);

        return new int[]{lb, ub - 1};
    }
}