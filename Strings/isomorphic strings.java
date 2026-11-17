
import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            char c = t.charAt(i);

            if (map.containsKey(ch)) {
                if (map.get(ch) != c) {
                    return false;
                }
            }
            else {
                if (set.contains(c)) {
                    return false;
                }

                map.put(ch, c);
                set.add(c);
            }
        }

        return true;
    }
}
