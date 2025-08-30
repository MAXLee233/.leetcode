/*
 * @lc app=leetcode.cn id=2683 lang=java
 *
 * [2683] 相邻值的按位异或
 */

// @lc code=start
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xor = derived[0];
        for (int i = 1; i < derived.length; i++) {
            xor ^= derived[i];
        }
        return xor == 0 ;
    }
}
// @lc code=end

