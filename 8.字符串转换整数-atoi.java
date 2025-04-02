/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        String res="";
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if (c==' '&&res.length()==0) {
                continue;
            }else if (c=='-'&&res.length()==0) {
                res = c+res;
            }else if (c>='0'&&c<='9') {
                res = res +c;
            }else if (Character.isLetter(c)&&res.length()==0) {
                return 0;
            }else if (Character.isLetter(c)&&res.length()!=0) {
                break;
            }
        }
        return Integer.parseInt(res);
    }
}
// @lc code=end

