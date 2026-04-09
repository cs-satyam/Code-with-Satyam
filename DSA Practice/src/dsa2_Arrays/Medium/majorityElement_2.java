package dsa2_Arrays.Medium;
import java.util.*;

public class majorityElement_2 {
    public static void main(String[] args) {
        int a[]={3,2,3};

        System.out.println(majorityElement(a));
    }

        static List<Integer> majorityElement(int[] a) {
            int n=a.length;
            HashMap<Integer,Integer> hm= new HashMap<>();
            ArrayList<Integer> al=new ArrayList<>();
            if(n<3){
                for(int i:a){
                    al.add(i);
                }
                return al;
            }
            for (int i = 0; i < n; i++) {
                if (!hm.containsKey(a[i])) {
                    hm.put(a[i], 1);
                } else {
                    hm.put(a[i], hm.get(a[i]) + 1);
                }
                if (hm.get(a[i]) > n / 3 && !al.contains(a[i])) {
                    al.add(a[i]);
                }
            }

            return al;
        }


    }

