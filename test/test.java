public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.makeFancyString("leeetcode");
        System.out.println(result); // 输出 "leetcod"      
    } 
}
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        sb.append(s.charAt(0)); // 添加第一个字符
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if( count <= 2) { // 只允许连续字符出现两次
                    sb.append(s.charAt(i));
                }else {
                    // 如果连续字符超过两次，则不添加
                    continue;
                }
            } else {
                count = 1; // 重置计数器
                sb.append(s.charAt(i)); // 添加不同的字符
            }
        }
        return sb.toString();
    }
}