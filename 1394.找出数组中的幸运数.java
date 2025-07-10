/*
 * @lc app=leetcode.cn id=1394 lang=java
 *
 * [1394] 找出数组中的幸运数
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        int res=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                res = Math.max(res, key);
            }
        }
        return res;
    }
}
// @lc code=end

