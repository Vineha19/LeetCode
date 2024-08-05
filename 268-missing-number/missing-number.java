class Solution {
    public int missingNumber(int[] nums) {
        // int maxi=0;
        Arrays.sort(nums);
        int maxi=nums[nums.length-1];
        // for(int i=0; i<nums.length; i++)
        // {
        //     if(nums[i]>maxi)
        //     {
        //         maxi=nums[i];
        //     }
        // }

        int hash[] = new int[maxi+1];
        for(int i=0; i<nums.length; i++)
        {
            hash[nums[i]]=1;
        }
        for(int i=0; i<nums.length; i++)
        {
            if(hash[i]==0)
            {
                return i;
            }
        }
    return maxi+1 ;
    }
}