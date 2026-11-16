class Solution {
    public List<String> commonChars(String[] words) {
        int []common = new int[26];
        for(char ch:words[0].toCharArray()){
            common[ch-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int[] current = new int[26];
            for(char ch: words[i].toCharArray()){
                current[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                common[j]=Math.min(current[j],common[j]);
            }
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<common[i];j++){
                result.add(""+(char)(i+'a'));
            }
        }
        return result;
    }
}
    
