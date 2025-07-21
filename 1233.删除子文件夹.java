/*
 * @lc app=leetcode.cn id=1233 lang=java
 *
 * [1233] 删除子文件夹
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res = new ArrayList<String>();
        boolean[] isSubfolder = new boolean[folder.length];
        for (int i = 0; i < folder.length; i++) {
            for (int j = 0; j < folder.length; j++) {
                if (i != j && folder[j].startsWith(folder[i] + "/")) {
                    isSubfolder[j] = true;
                }
            }
        }
        return res;
    }
}
// @lc code=end

