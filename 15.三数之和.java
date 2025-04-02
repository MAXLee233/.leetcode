/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l=i+1,r=nums.length-1;
            while (l<r) {
                if (nums[l]+nums[r]==-nums[i]) {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
                if (nums[l]+nums[r]> -nums[i]) {
                    r--;
                }
                if (nums[l]+nums[r]< -nums[i]) {
                    l++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

