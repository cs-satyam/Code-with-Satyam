package dsa2_Arrays.Easy;

public class thirdMaxNum {
    static int thirdMax(int a[]){
        int n = a.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(a[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            } else if(a[i] > max2 && a[i] < max1){
                max3 = max2;
                max2 = a[i];
            } else if(a[i] > max3 && a[i] < max2){
                max3 = a[i];
            }
        }

        return (max3 == Integer.MIN_VALUE) ? max1 : max3;
    }
    public static void main(String[] args) {
        int[] a = {3, 2, 1};
        int result = thirdMax(a);
        System.out.println("third max num: " + result);
    }
    
}
