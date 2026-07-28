package BufferReader;


import java.io.*;
import java.util.*;

public class strignMapInput {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String[] parts = br.readLine().split(" ");



            if (parts[0].equals("put")) {
                int key = Integer.parseInt(parts[1]);
                int value = Integer.parseInt(parts[2]);

                map.put(key, value);

            } else if (parts[0].equals("get")) {
                int key = Integer.parseInt(parts[1]);

                System.out.println(map.getOrDefault(key, -1));
            }
        }
    }
}