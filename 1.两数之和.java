/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []result=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ;i< nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
// @lc code=end

