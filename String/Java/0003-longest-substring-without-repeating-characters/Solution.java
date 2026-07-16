import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        Set<Character> set = new HashSet<>();
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            while (set.contains(c)) {
                set.remove(s.charAt(l));
                l++;
            }

            res = Math.max(res, r - l + 1);
            set.add(c);
        }

        return res;
    }
}
