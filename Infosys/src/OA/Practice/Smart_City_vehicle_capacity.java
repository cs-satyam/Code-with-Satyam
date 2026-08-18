package OA.Practice;

//the smart city authority has installed charging station along a highway
//Each charging station has a charging capicity measured kilometer
//

import java.util.*;

public class Smart_City_vehicle_capacity {
    public static void main(String[] args) {
        int n=6;
        int cap[]={10,18,25,31,42,55};

        int t=73;
        int ans[] =vehicleCapacity(cap,t,n);
        System.out.println(ans[0]+" "+ans[1]);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] vehicleCapacity(int a[],int t,int n){
        int i=0;
        int j=n-1;
        while(i<j){

            if(a[i]+a[j]==t) return  new int[] {i,j} ;
            else if (a[i]>a[j])  j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}
