/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] cs= str.toCharArray();
            Arrays.sort(cs);
            String key = new String(cs);
            List newList=map.getOrDefault(key, new ArrayList<String>());
            newList.add(str);
            map.put(key, newList); // 更新 map 中的列表
        }
        res.addAll(map.values());
        return res;   
    }
}
// @lc code=end

