package CRT;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class shooping {
    public static void main(String[] args) {
        int amount = 56867;

        // Using TreeSet with reverseOrder to force 2000 -> 1 order
        Set<Integer> hm = new TreeSet<>(Collections.reverseOrder());
        hm.add(2000);
        hm.add(500);
        hm.add(200);
        hm.add(100);
        hm.add(50);
        hm.add(20);
        hm.add(10);
        hm.add(5);
        hm.add(2);
        hm.add(1);

        for (int i : hm) {
            System.out.println(i + ":" + amount / i+" "+amount % i);
            amount = amount % i;
        }
    }
}
