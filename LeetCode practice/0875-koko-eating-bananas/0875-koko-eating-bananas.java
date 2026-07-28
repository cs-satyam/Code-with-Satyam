class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        long l = 1;
        long r = 0;

        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        while (l <= r) {

            long mid = l + (r - l) / 2;

            if (hoursNeeded(piles, mid) > h) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return (int)l;
    }

    long hoursNeeded(int[] piles, long speed) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }

        return hours;
    }
}