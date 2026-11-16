class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] common=new int[26];
        for(char ch: magazine.toCharArray()){
            common[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            common[ch-'a']--;
        
        }
        for(int i=0;i<26;i++){
            if(common[i]<0){
                return false;
            }
        }
        return true;
    }
}
