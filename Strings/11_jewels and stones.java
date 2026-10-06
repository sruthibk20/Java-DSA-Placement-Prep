class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            set.add(ch);
        }
        for(int j=0;j<stones.length();j++){
            char word=stones.charAt(j);
            if(set.contains(word)){
                count++;
            }
        }
        return count;
    }
}
