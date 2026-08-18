package OA.BinarySearch;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int a[]={3,4,5,1,2};
        System.out.println( findMin(a));
    }
    static int findMin(int a[]){
     int l=0;
     int r=a.length-1;
     while(l<r){
         int mid = l+(r-l)/2;
         if(a[mid]>a[r]){
             l=mid+1;
         }else{
             r=mid-1;
         }
     }
     return a[l];
    }
}
