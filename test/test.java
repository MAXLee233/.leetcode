package test;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String s = "a#b%*";
        Solution solution = new Solution();
        String result = solution.processStr(s);
        System.out.println(result); // 输出处理后的字符串
    } 
}
class Solution {
    public String processStr(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                res+=s.charAt(i);
            }
            if(s.charAt(i)=='*'){
                int n=res.length();
                if(n!=0){
                    res= res.substring(0,n-1); // 删除最后一个字符
                }
            }
            if(s.charAt(i)=='#'){
                res += res;
            }
            if(s.charAt(i)=='%'){
                res = new StringBuilder(res).reverse().toString();
            }
        }
        return res;
    }
}