/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length()&&(s+s).contains(goal);
    }
}
// @lc code=end

