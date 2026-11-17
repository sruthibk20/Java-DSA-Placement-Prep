class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String ch : strs){
            char[] arr=ch.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(ch);
            }
            else{
            map.put(s,new ArrayList<>());
            map.get(s).add(ch);
        }
        }
        return new ArrayList<>(map.values());
    }
}
