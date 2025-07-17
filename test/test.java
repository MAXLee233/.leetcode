public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,1,1,2,1,2};
        int result = solution.maximumLength(nums);
        System.out.println(result); // Expected output: 7      
    } 
}
class Solution {
    public int maximumLength(int[] nums) {
        int res=0;
        
        int tmp = 0;    
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(nums[i]%2==1){
                    tmp++;
                }
            }else{
                if(nums[i]%2==0){
                    tmp++;
                }
            }
        }
        res = Math.max(res, tmp);
        tmp = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(nums[i]%2==0){
                    tmp++;
                }
            }else{
                if(nums[i]%2==1){
                    tmp++;
                }
            }
        }
        res = Math.max(res, tmp);
        tmp = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(nums[i]%2==1){
                    tmp++;
                }
            }else{
                if(nums[i]%2==1){
                    tmp++;
                }
            }
        }
        res = Math.max(res, tmp);
        tmp = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                if(nums[i]%2==0){
                    tmp++;
                }
            }else{
                if(nums[i]%2==0){
                    tmp++;
                }
            }
        }
        res = Math.max(res, tmp);
        return  res;
    }
}