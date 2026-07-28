package dsa2_Arrays.Easy;

public class moveZero {
    static void moveZeroWithTwoPointer(int[] a){
        int n=a.length;
        int i=0,j=0;
        while(i<n){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;

            }i++;
        }

    }
    public static void main(String[] args) {
        int n=5;
        int a[]={0,1,0,3,12};
        moveZeroWithTwoPointer(a);

        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
