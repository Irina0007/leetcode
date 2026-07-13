import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;

        for (int a : set) {
            if (!set.contains(a - 1)) {
                int length = 1;

                while (set.contains(a + length)) {
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
