package OA.Practice.InfosysPyq;

import java.util.Arrays;
import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int e = s.nextInt();
        
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i : a) i = s.nextInt();
        Arrays.sort(a);
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (e >= 0 && e - a[i] >= 0) {
                e -= 2 * a[i];
                c = c + 1;
            }
        }
        System.out.println(c);

    }
}
