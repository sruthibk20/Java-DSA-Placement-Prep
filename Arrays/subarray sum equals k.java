class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int currsum=0;
        int count=0;
        int n=nums.length;
        map.put(0,1);
        for(int i=0;i<n;i++){
            currsum+=nums[i];
            int needed=currsum-k;
            if(map.containsKey(needed)){
                count+=map.get(needed);
            }
            map.put(currsum, map.getOrDefault(currsum, 0) + 1);
        }
        return count;
    }
}
