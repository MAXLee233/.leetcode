/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []result=new int[2];
        int i=0;
        int j =1;
        for (i=0;i<nums.length;i++) {
             for ( j=i+1;j<nums.length;j++) {
                if((nums[i]+nums[j])==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
            
        }

        return result;
    }
}
// @lc code=end

