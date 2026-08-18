package BinarySearch;

// https://leetcode.com/problems/sqrtx/description/

public class Sqrt_X_ {
    public static void main(String[] args) {
        int n=4;
        int x=sqrt(n);
        System.out.println("Square root of "+n+" is : "+x);
    }
    static int sqrt(int x){
        if(x==0||x==1){
            return x;
        }
        long l=1;
        long r=x/2;
        while(l<=r){
            long mid= l+(r-l)/2;
            if(mid*mid==x){
                return (int )mid;
            } else if (mid*mid<x) {
                l=mid+1;

            }else r=mid-1;
        }
        return (int)r;
    }
}
