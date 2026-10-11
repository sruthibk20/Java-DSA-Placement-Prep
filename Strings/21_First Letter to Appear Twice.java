class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character>set = new HashSet<>();
        int i=0;
        while(i<s.length()){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
            i++;
        }
        return ' ';
    }
}
