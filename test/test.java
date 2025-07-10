package test;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        Solution solution = new Solution();
        int[] result = solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result)); // 输出结果
    } 
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int [] res = new int[n - k + 1];
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < res.length; i++) {
            max = Integer.MIN_VALUE; // 重置最大值
            for (int j = i; j < i+k; j++) {
                max= Math.max(max, nums[j]);
            }
            res[i] = max; // 将当前窗口的最大值存入结果数组
        }
        return res;
    }
}