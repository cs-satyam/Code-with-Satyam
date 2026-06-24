package BufferReader;

import java.io.*;

public class ArrayInput {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

//         Array input without size
        System.out.println("Array Input Without Size:");

        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.print("Output: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Array input with size
        System.out.println("Array Input With Size:");
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];

        String[] nums = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(nums[i]);
        }


        System.out.print("Output: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}