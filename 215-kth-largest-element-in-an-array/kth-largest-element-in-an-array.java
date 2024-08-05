class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

    for(int num: nums){
        min = num < min? num: min;
        max = num > max? num: max;
    }

    int[] count = new int[max-min+1];

    for(int num:nums){
        count[num -min]++;
    }

    for(int i = count.length-1; i>=0; i--){
        k-= count[i];

        if(k <= 0)
            return i+min;

    }

    return -1;
    }
}