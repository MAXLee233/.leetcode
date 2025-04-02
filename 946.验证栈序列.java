/*
 * @lc app=leetcode.cn id=946 lang=java
 *
 * [946] 验证栈序列
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i1=0,i2=0;
        Stack<Integer> stack=new Stack<>();
        while (i1<pushed.length) {
            if (pushed[i1]==popped[i2]) {
                i1++;
                i2++;
            }else if (!stack.isEmpty()&&stack.peek()==popped[i2]) {
                stack.pop();
                i2++;
            }else{
                stack.push(pushed[i1]);
                i1++;
            }
        }
        while (i2<popped.length) {
            if (stack.peek()==popped[i2]) {
                stack.pop();
            }
            i2++;
        }
        return stack.isEmpty();
    }
}
// @lc code=end

