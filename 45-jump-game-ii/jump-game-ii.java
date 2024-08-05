class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int i,m=0;
        int last=0;
        int count=0;
        if(nums[0]==0||nums[0]==1 &&n==1){
            return count;
        }
        for(i=0;i<=n-1;i++)
        {
             m=Math.max(m,i+nums[i]);
            if(m>=n-1){
                 ++count;
                 return count;
        }
        if(i ==last){
            ++count;
            last=m;
        }
        }
        return count;
    }
}