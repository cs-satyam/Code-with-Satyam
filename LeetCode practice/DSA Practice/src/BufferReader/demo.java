package BufferReader;

import java.io.*;
import java.util.StringTokenizer;

public class demo {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Integer
        int n = Integer.parseInt(br.readLine());
        System.out.println("Integer: " + n);

        // Long
        long l = Long.parseLong(br.readLine());
        System.out.println("Long: " + l);

        // Double
        double d = Double.parseDouble(br.readLine());
        System.out.println("Double: " + d);

        // String
        String str = br.readLine();
        System.out.println("String: " + str);

        // Character
        char ch = br.readLine().charAt(0);
        System.out.println("Character: " + ch);

    }
}