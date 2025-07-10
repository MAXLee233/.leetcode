/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 排序
        Arrays.sort(nums);
        // 双指针 
        // 遍历每个数作为第一个数
        //第二个数从i+1开始，第三个数从数组末尾开始
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // 去重
            }
            int third = nums.length - 1;
            for (int j = i+1; j < nums.length; j++) {
                if (j> i + 1 && nums[j] == nums[j - 1]) {
                    continue; 
                }
                while (third > j && nums[i] + nums[j] + nums[third] > 0) {
                    third--; // 找到满足条件的第三个数
                }
                if (third == j) {
                    break; // 如果第三个数和第二个数相同，说明没有满足条件的三元组
                }
                if (nums[i] + nums[j] + nums[third] == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[third]));
                }
            }
        }
        return res;
    }
}
// @lc code=end

