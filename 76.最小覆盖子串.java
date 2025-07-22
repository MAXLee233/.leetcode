/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }
        //resleft和resRight分别表示最小覆盖子串的起始和结束位置
        int resLeft = 0, resRight = Integer.MAX_VALUE;
        int left = 0, right = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            while (isValid(window, tMap)) {
                if (right - left + 1 < resRight - resLeft) {
                    resLeft = left;
                    resRight = right + 1;
                }
                char leftChar = s.charAt(left);
                //缩小窗口
                window.put(leftChar, window.get(leftChar) - 1);
                if (window.get(leftChar) == 0) {
                    window.remove(leftChar);
                }
                left++;
            }
            right++;
        }
        if (resRight == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(resLeft, resRight);
    }
    private boolean isValid(HashMap<Character, Integer> window, HashMap<Character, Integer> tMap) {
        for (char c : tMap.keySet()) {
            if (window.getOrDefault(c, 0) < tMap.get(c)) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

