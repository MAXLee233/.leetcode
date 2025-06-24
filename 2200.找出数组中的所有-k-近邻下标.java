/*
 * @lc app=leetcode.cn id=2200 lang=java
 *
 * [2200] 找出数组中的所有 K 近邻下标
 */

// @lc code=start

import java.util.List;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> keyIndices = new ArrayList<>();
        // 找出所有 key 的下标
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }
        // 遍历所有下标
        for (int i = 0; i < nums.length; i++) {
            // 检查当前下标 i 是否在 keyIndices 中的任意一个下标 k 的 k 距离内
            for (int keyIndex : keyIndices) {
                if (Math.abs(i - keyIndex) <= k) {
                    res.add(i);
                    break; // 找到一个满足条件的就可以跳出内层循环
                }
            }
        }
        return res;
    }
}
// @lc code=end

