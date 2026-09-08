class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[mid + 1]) {
                // Going UP → peak is on the right
                left = mid + 1;
            }
            else {
                // Going DOWN → peak is at mid or on the left
                right = mid;
            }
        }

        return left;
    }
}
