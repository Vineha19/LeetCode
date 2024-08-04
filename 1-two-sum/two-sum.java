class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int a[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int i;
        for(i=0;i<=n-1;i++)
        {
            int key=target-nums[i];
            if(map.containsKey(key))
            {
                a[0]=map.get(key);
                a[1]=i;
            }
            map.put(nums[i],i);
        }
        return a;
    }
}