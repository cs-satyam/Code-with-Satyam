package BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int a[]={};
        int k=14;
        int x=findUpperBound(a,k);
        System.out.println("Upper bound: "+x);
    }
    static int findUpperBound(int a[],int k){
        int l=0;
        int r=a.length-1;
        int ans=0;
        while (l<=r) {
            int mid = (l + r) / 2;
            if (a[mid] < k) {
                ans = k;
                l = mid + 1;
            } else r = mid - 1;
        }
        return ans;
    }

}
