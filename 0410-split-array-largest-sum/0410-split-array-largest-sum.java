class Solution {
    static int findPages(int a[],int k){
        long l=0;
        long h=0;
        for(int i:a){
            l= Math.max(l,i);
            h+=i;
        }
        while(l<=h){
            long mid= l+(h-l)/2;
            if(countStudent(a,mid)>k){
                l=mid+1;

            }else{
                h=mid-1;
            }


        }
        return (int) l;
    }
    static int countStudent(int a[],long p){
        int studentCount=1;
        int pages=0;
        for(int i:a){
            if(pages+i<=p){
                pages += i;
            }
            else{
                studentCount++;
                pages =i;
            }
        }
        return studentCount;
    }
    public int splitArray(int[] nums, int k) {
        return findPages(nums,k);
    }
}