package dsa1_Sorting_Algorithms;

import java.util.Arrays;

public class countingSort {
    static void countingSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        int[] count = new int[max + 1];
        for (int value : arr) {
            count[value]++;
        }

        int index = 0;
        for (int value = 0; value < count.length; value++) {
            while (count[value] > 0) {
                arr[index++] = value;
                count[value]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
