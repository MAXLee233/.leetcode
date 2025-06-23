/*
 * @lc app=leetcode.cn id=2138 lang=java
 *
 * [2138] 将字符串拆分为若干长度为 k 的组
 */

// @lc code=start
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length()/k;
        if(s.length()%k!=0){
            n++;
        }
        String [] res = new String[n];
        int i=0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() < k) {
                sb.append(c);    
            }else{
                res[i] = sb.toString();
                i++;
                sb.setLength(0); // 清空 StringBuilder
                sb.append(c);
            }
        }
        // 处理最后一组
        if (sb.length() < k) {
            while (sb.length() < k) {
                sb.append(fill);
            }
        }
        res[i] = sb.toString();
        return res;
    }
}
// @lc code=end

