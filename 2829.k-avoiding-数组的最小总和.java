/*
 * @lc app=leetcode.cn id=2829 lang=java
 *
 * [2829] k-avoiding 数组的最小总和
 */

// @lc code=start
class Solution {
    public int minimumSum(int n, int k) {
        int res=0;
        int i=1;
        int c=0;
        while (c<n) {
            if (i<=k/2) {
                res += i;
                c++;
            }
            if (i>=k) {
                res +=i;
                c++;
            }
            i++;
        }
        return res;
    }
}
// @lc code=end

