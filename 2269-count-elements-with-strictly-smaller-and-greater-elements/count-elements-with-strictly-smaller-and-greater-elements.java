class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min && nums[i]<max){
                count++;
            }
        }
        return count;
    }
}