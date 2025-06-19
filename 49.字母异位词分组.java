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
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            // 将字符串转换为字符数组并排序
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);
            // 使用排序后的字符串作为键
            List <String> list= map.getOrDefault(sortedStr, new ArrayList<String>());
            list.add(strs[i]);
            map.put(sortedStr, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
// @lc code=end

