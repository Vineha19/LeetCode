
class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int ans =nums[0];
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if ( s>0  && nums[mid]<nums[mid-1]){
                return nums[mid];
            } 
            else  if ( e<nums.length-1  && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if (s!=e && (nums[s] == nums[mid] && nums[mid] == nums[e])) {
                s++;
                e--;
                continue;
            }  
           if (nums[mid] <= nums[e]){
                if(nums[mid]<ans) 
                {
                    ans = nums[mid];
                }
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }
        return ans;
    }
}