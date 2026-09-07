class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int len=1;
        int maxlen=1;
        Arrays.sort(nums);
        for(int i=n-1;i>=0;i--){
            if(i>0&&nums[i]==nums[i-1]){    //check duplicates
                continue;
            }
            if(i>0 && nums[i]-1==nums[i-1]){
                len++;
                
            }
            else{
                maxlen=Math.max(len,maxlen);
                len=1;
            }
        }
        return maxlen;
    }
}
