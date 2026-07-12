import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];

            if (map.containsKey(a)) {
                if (i - map.get(a) <= k) {
                    return true;
                }
            }

            map.put(a, i);
        }

        return false;
    }
}
