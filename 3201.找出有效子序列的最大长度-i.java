/*
 * @lc app=leetcode.cn id=3201 lang=java
 *
 * [3201] 找出有效子序列的最大长度 I
 */

// @lc code=start
class Solution {
    public int maximumLength(int[] nums) {
        int res=0;
        //有效子序列即意味着sub[0]%2=sub[2]%2=0,sub[1]%2=sub[3]%2=1
        //即偶数下标的元素奇偶性相同，奇数下标的元素奇偶性相同
        //三种情况
        //1.偶数下标的元素和奇数下标的元素奇偶性相同
        //2.偶数下标的元素都是奇数，奇数下标的元素都是偶数
        //3.偶数下标的元素都是偶数，奇数下标的都是奇数
        int tmp = 0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((i-count)%2==0){
                if(nums[i]%2==1){
                    tmp++;
                }else{
                    count++;
                }
            }else{
                if(nums[i]%2==0){
                    tmp++;
                }else{
                    count++;
                }
            }
        }
        res = Math.max(res, tmp);
        tmp = 0;
        count=0;
        for(int i=0;i<nums.length;i++){
            if((i-count)%2==0){
                if(nums[i]%2==0){
                    tmp++;
                }else{
                    count++;
                }
            }else{
                if(nums[i]%2==1){
                    tmp++;
                }else{
                    count++;
                }
            }
        }
        res = Math.max(res, tmp);
        tmp = 0;
        count=0;
        for(int i=0;i<nums.length;i++){
            if((i-count)%2==0){
                if(nums[i]%2==1){
                    tmp++;
                }else{
                    count++;
                }
            }else{
                if(nums[i]%2==1){
                    tmp++;
                }else{
                    count++;
                }
            }
        }
        res = Math.max(res, tmp);
        tmp = 0;
        count=0;
        for(int i=0;i<nums.length;i++){
            if((i-count)%2==0){
                if(nums[i]%2==0){
                    tmp++;
                }else{
                    count++;
                }
            }else{
                if(nums[i]%2==0){
                    tmp++;
                }else{
                    count++;
                }
            }
        }
        res = Math.max(res, tmp);
        return  res;
    }
}
// @lc code=end

