package Array;
import java.util.TreeSet;

public class thirdMaximumelement {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 4, 5};
        System.out.println(thirdMax(a));

    }
        static int thirdMax(int[] nums) {
            TreeSet<Integer> set = new TreeSet<>();

             for (int num : nums) {
                set.add(num);
            }

             if (set.size() < 3) {
                return set.last();
            }

             set.remove(set.last());
             set.remove(set.last());

             return set.last();
        }


}
