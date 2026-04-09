package Sorting_Algorithms;

public class selectionSort {
    static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(i!=min) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={5,1,2,7,3};

        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
