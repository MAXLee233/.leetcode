import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        test t = new test();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = t.groupAnagrams(strs);  
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

   public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] cs= str.toCharArray();
            Arrays.sort(cs);
            String key = new String(cs);
            // 使用 getOrDefault 方法来获取或创建列表
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list); // 更新 map 中的列表
        }
        res.addAll(map.values());
        return res;   
    }
    
}
