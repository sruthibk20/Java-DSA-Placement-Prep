class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first=strs[0];
        for(int i=0;i<strs[0].length();i++){
            
            char ch=first.charAt(i);
            for(int j=1;j<strs.length;j++){
                String word=strs[j];
                if(i>=word.length()|| word.charAt(i)!=ch){
                    return first.substring(0,i);
                }
            }

        }
        return first;
    }
}
