package Sorting_Algorithms;
import java.util.Scanner;
import java.util.SortedMap;

public class bubbleSortSwap {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int bubbleSort(int[] arr) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapCount++;
                }else{
                    break;
                }
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int arr[] = {1 ,10 ,7 ,2,5};


        int swaps = bubbleSort(arr);

        printArray(arr);
        System.out.println("\nSwap count = " + swaps);
    }
}

class optimise{
    public static void main(String[] args) {
        int n = 5;
        int a[]={1,10,7,2,5};
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];

                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swaps++;
                    isSwap = true;
                }
            }
            if (!isSwap) break;


        }
        System.out.println("Swap count = " + swaps);
    }
}