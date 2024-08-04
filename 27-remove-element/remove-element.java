class Solution {
    public int removeElement(int[] nums, int val) {
        //OUR Approach!
    //     if (nums.length==0){
    //         return 0;
    //     }
    //     else{
    //    Arrays.sort(nums);
       
    //    int count = 0;
    //    int lastElementPlus1 = nums[nums.length-1] + 1;
    //    for (int i = 0; i<nums.length; i++){
    //         if (val == nums[i]){
    //         nums[i] = lastElementPlus1;
    //         count++;
    //         }
    //    }
    //    Arrays.sort(nums);
    //    return (nums.length-count);
    //     }

        int count = 0;
        for (int i = 0; i<nums.length; i++){
            if (val!=nums[i]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}