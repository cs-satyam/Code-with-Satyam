package TCS;

import java.io.*;

public class VasyaandTriangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().trim().split("");

        long n = Long.parseLong(arr[0]);
        long m = Long.parseLong(arr[1]);
        long k = Long.parseLong(arr[2]);

        if ((n * m) % k == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}