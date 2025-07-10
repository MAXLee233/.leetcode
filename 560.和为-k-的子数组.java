/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为 K 的子数组
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int n = nums.length;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        preSumMap.put(0, 1); // 初始化前缀和为0的情况
        for (int i : nums) {
            sum += i;
            if (preSumMap.containsKey(sum - k)) {
                res += preSumMap.get(sum - k); 
            }
            preSumMap.put(sum, preSumMap.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
// @lc code=end

