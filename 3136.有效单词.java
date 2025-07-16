/*
 * @lc app=leetcode.cn id=3136 lang=java
 *
 * [3136] 有效单词
 */

// @lc code=start
class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9')) {
                if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                    a = true;
                }else if(c>'9' || c<'0'){
                    b = true;
                }
        }else{
                return false;
            }
        }
        return a&&b;
    }
}
// @lc code=end

