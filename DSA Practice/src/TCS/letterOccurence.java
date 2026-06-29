package TCS;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class letterOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.print("{");
        int count = 0;

        for (char c : map.keySet()) {
            System.out.print("'" + c + "': " + map.get(c));
            count++;
            if (count < map.size()) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
    }
}