class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int h = 0;
        for (int i : weights) {
            l = Math.max(l, i);
            h += i;
        }

        while (l <= h) {
            int mid = l + (h - l) / 2;
            
            if (shipDays(weights, mid) > days) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return l;
    }

    int shipDays(int arr[], int limit) {
        int d = 1;
        int weight = 0;
        for (int i : arr) {
            if (weight + i <= limit) {
                weight += i;
            } else {
                d++;
                weight=i;
            }
        }
        return d;
    }
}