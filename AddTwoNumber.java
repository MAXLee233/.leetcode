/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1="";
        String num2="";
        for(ListNode i=l1;i.next!=null;i=i.next){
            num1=i.val+num1;
        }
        for(ListNode i=l2;i.next!=null;i=i.next){
            num2=i.val+num2;
        }
        int num =Integer.parseInt(num2)+Integer.parseInt(num1);
        String result=Integer.toString(num);
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        for (int i=result.length()-1;i>=0;i--) {
            curr.val=Integer.valueOf(result.indexOf(i));
            curr.next=new ListNode(Integer.valueOf(result.indexOf(i-1)));
            curr=curr.next;
        }
        return dummy;
    }
}

public class AddTwoNumber{
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // 输出结果链表
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }  
}
// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// @lc code=end

