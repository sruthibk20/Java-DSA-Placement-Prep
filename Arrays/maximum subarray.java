class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;<nums.length;i++){
            currsum=Math.max(nums[i],currsum+nums[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
}
