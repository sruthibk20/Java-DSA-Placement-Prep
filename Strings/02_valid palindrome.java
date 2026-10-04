class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            i++;
        }
        String og=sb.toString();
        String reverse=sb.reverse().toString();
        if(og.equals(reverse)){
            return true;
        }
        return false;
    }
}
