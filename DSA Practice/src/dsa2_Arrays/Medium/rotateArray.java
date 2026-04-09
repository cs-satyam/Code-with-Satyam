package dsa2_Arrays.Medium;

public class rotateArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;

        rotate(a,k);


        for(int i:a){
            System.out.print(i+" ");
        }   
    }
    static void rotate(int[] a, int k) {
        int n = a.length;
        if (n == 0) return;
        
         k = k % n; 
        
        int[] arr = new int[n];

         for (int i = 0; i < k; i++) {
            arr[i] = a[n - k + i];
        }

         for (int i = k; i < n; i++) {
            arr[i] = a[i - k];
        }

         for (int i = 0; i < n; i++) {
            a[i] = arr[i];
        }
    }
}
