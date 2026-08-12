//1.floyd's cycle detection method
class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        for(;;){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(fast==slow)
            break;
        }
        int find=0;
        while(slow!=find){
            slow=nums[slow];
            find=nums[find];
        }
        return slow;
    }
}
//2.hashset
HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
