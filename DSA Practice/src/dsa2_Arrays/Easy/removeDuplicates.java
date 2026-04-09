package dsa2_Arrays;

public class removeDuplicates {
    static int removeDuplicates(int[] nums) {
        
        int k = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[k] = nums[i];

                k++;
            }
        }
        return k;
        
    }
    public static void main(String[] args) {
        int a[] = {1,1,2};
        int result = removeDuplicates(a);
        System.out.println("length of array after removing duplicates: " + result);

    }
    
}
