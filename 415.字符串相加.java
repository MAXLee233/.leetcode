/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start

class Solution {
    public String addStrings(String num1, String num2) {
        String res="";
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int p=0;
        while (n1>=0&&n2>=0) {
            int c1=num1.charAt(n1)-'0';
            int c2=num2.charAt(n2)-'0';
            if (c1+c2+p>=10) {
                res = (c1+c2+p-10) +res;
                p=1;
            }else{
                res = (c1+c2+p) +res;
                p=0;
            }
            n1--;
            n2--;
        }
        while (n2>=0) {
            if (num2.charAt(n2)-'0'+p>=10) {
                res = (num2.charAt(n2)-'0'+p-10) +res;
                p=1;
            }else{
                res = (num2.charAt(n2)-'0'+p) +res;
                p=0;
            }
            n2--;
        }
        
        while (n1>=0) {
            if (num1.charAt(n1)-'0'+p>=10) {
                res = (num1.charAt(n1)-'0'+p-10) +res;
                p=1;
            }else{
                res = (num1.charAt(n1)-'0'+p) +res;
                p=0;
            }
            n1--;
        }
        if (p==1) {
            res = 1+res;
        }
        return res;
    }
}
// @lc code=end

