package Array;

public class findMaxConsecutiveOnes
{
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,1};
        System.out.println( maxConsecutiveOnes(a));
    }
    static int  maxConsecutiveOnes( int nums[]){
        int l=0;
        int maxcount=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                l=r+1;
            }else{
                int curcount=r-l+1;
                maxcount=Math.max(curcount,maxcount);
            }
        }
        return maxcount;
    }
}
