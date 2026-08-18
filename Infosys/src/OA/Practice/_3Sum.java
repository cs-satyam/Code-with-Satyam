package Practice;
import java.util.*;

public class _3Sum {
    public static void main(String[] args) {
        int a[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(a);

        System.out.println("Input: " + Arrays.toString(a));
        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a); // -4 -1 -1 0 1 2

        for (int i = 0; i < a.length - 2; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue; // skip duplicates

            int l = i + 1, r = a.length - 1;
            while (l < r) {
                int total = a[i] + a[l] + a[r];

                if (total == 0) {
                    res.add(Arrays.asList(a[i], a[l], a[r]));

                    // skip duplicates
                    while (l < r && a[l] == a[l + 1]) l++;
                    while (l < r && a[r] == a[r - 1]) r--;

                    l++;
                    r--;
                } else if (total < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
