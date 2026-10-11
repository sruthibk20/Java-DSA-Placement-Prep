class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int left = 0;

        for (int right = 0; right <= arr.length; right++) {
            if (right == arr.length || arr[right] == ' ') {
                int i = left;
                int j = right - 1;

                while (i < j) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }

                left = right + 1;
            }
        }

        return new String(arr);
    }
}
