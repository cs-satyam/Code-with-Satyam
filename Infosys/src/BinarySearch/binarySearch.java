package BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int key =10;
        System.out.println( search(a,key));
    }
    static boolean search(int arr[],int key){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid= (l+r)/2;

            if(arr[mid]==key){
                return true;
            } else if (arr[mid]<key) {
                l=mid+1;

            }else r=mid-1;
        }
        return false;

    }
}
