import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                // Avoid adding the same duplicate multiple times
                if (duplicates.isEmpty() || !duplicates.contains(nums[i])) {
                    duplicates.add(nums[i]);
                }
            }
        }
        
        return duplicates;
    }
}
