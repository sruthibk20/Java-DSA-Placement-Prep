class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            int digits = 0;
            int temp = num;

            if (temp == 0) {
                digits = 1;
            }

            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
