package String;
import java.util.*;

public class strignMapInput {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine());
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String[] parts = sc.nextLine().split(" ");

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
