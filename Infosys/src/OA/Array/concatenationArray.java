package Array;

public class concatenationArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]= new int[2*a.length];

//        b[]={1,2,3,4,5,1,2,3,4,5
//             0 1 2 3 4 5 6 7 8 9 10
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];              // first half
            b[i + a.length] = a[i];   // second half
        }

        for(int i:b){
            System.out.print(" "+i);
        }
    }
}
