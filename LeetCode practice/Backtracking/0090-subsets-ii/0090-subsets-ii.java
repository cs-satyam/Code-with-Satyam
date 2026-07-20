import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // IMPORTANT for duplicates
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result,
            List<Integer> current,
            int[] nums,
            int start) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            // skip duplicates at the same recursion level
            if (i > start && nums[i] == nums[i - 1])
                continue;

            current.add(nums[i]);
            backtrack(result, current, nums, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
