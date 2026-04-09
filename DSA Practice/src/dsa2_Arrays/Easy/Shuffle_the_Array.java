package dsa2_Arrays;

public class Shuffle_the_Array {
    static int[] shuffle(int[] a, int n){
        int[] ans = new int[2*n];

        for(int i = 0; i < n; i++){

            ans[2*i] = a[i];

            ans[2*i + 1] = a[i + n];
        }
        System.out.println(ans.length);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,3,4,7};
        int n = 3;
        int[] result = shuffle(a, n);
        System.out.print("shuffled array: ");
        for(int i = 0; i < 2*n; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}
