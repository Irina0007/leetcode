import java.util.*;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int now = values.get(s.charAt(i));
            int next;
            if (i < s.length() - 1) {
                next = values.get(s.charAt(i + 1));
                if (now < next) {
                    res = res - now;
                } else {
                    res = res + now;
                }
            } else {
                res = res + now;
            }
        }
        return res;
    }
}
