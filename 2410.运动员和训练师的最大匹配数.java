/*
 * @lc app=leetcode.cn id=2410 lang=java
 *
 * [2410] 运动员和训练师的最大匹配数
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int res= 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0, j = 0;
        while (i < players.length && j < trainers.length) {
            if (players[i] <= trainers[j]) {
                res++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return res;

    }
}
// @lc code=end

