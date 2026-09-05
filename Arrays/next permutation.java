class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = -1;

        // 1. Find pivot
        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // 2. No pivot → array is in descending order
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3. Find number just bigger than pivot
        for (int i = n - 1; i > pivot; i--) {

            if (nums[i] > nums[pivot]) {

                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        // 4. Reverse the part after pivot
        reverse(nums, pivot + 1, n - 1);
    }

    void reverse(int[] nums, int start, int end) {

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
