package BinarySearch;

public class lowerBound
{
    public static void main(String[] args) {
        int a[]={};
        int k=10;
      int x=  findLowerBound(a,k);
        System.out.println("Lower bound: "+x);

    }
    static int findLowerBound(int a[],int k){
        int l=0;
        int r=a.length-1;
        int ans=0;
        while (l<=r){
            int mid = (l+r)/2;
            // may be an answer
            if(a[mid]>=k){
                ans=mid;
                r=mid-1;
            }else
                l=mid+1;

        }
        return ans;

    }
}
