/*
 * @lc app=leetcode.cn id=869 lang=java
 *
 * [869] 重新排序得到 2 的幂
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean reorderedPowerOf2(int n) {
        //首先计算2的幂的所有可能的数字
        int [] powerOf2= new int[30];
        for (int i = 0; i < 30; i++) {
            powerOf2[i] = (int) Math.pow(2, i);
        }
        for (int i = 0; i < powerOf2.length; i++) {
            //将数字转化为hashmap
            HashMap<Character, Integer> map = new HashMap<>();
            String str = String.valueOf(powerOf2[i]);
            for (char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            //将n转化为hashmap
            HashMap<Character, Integer> nMap = new HashMap<>();
            String nStr = String.valueOf(n);
            for (char c : nStr.toCharArray()) {
                nMap.put(c, nMap.getOrDefault(c, 0) + 1);
            }
            //比较两个hashmap是否相等
            if (map.equals(nMap)) {
                return true;
            }
    }
        return false;
    }
}
// @lc code=end6

