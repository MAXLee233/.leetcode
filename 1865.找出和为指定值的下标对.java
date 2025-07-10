/*
 * @lc app=leetcode.cn id=1865 lang=java
 *
 * [1865] 找出和为指定值的下标对
 */

// @lc code=start

import java.util.HashMap;

class FindSumPairs {
    int [] nums1, nums2;
    HashMap<Integer, Integer> map = new HashMap<>(); 
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1; // 初始化 nums1
        this.nums2 = nums2; // 初始化 nums2
        // 预处理 nums2 中的元素，统计每个元素出现的次数
        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldValue = nums2[index]; // 获取 nums2 中指定下标的旧值
        nums2[index] += val; // 更新 nums2 中指定下标的值
        // 更新 map 中的计数
        map.put(oldValue, map.get(oldValue) - 1); // 减少旧值的计数
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1); // 增加新值的计数
        if (map.get(oldValue) == 0) {
            map.remove(oldValue); // 如果旧值的计数为 0，则从 map 中移除
        }
    }
    
    public int count(int tot) {
        int res=0;
        // 遍历 nums1 中的每个元素
        for (int i : nums1) {
            if (map.containsKey(tot - i)) {
                // 如果 nums1 中的元素与 nums2 中的某个元素之和等于 tot，则累加计数
                res += map.get(tot - i);   
            }
        }
        return res;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
// @lc code=end

