package IntroductionToDataStructure.Day06;

import java.util.HashMap;
import java.util.Map;

// 有效的字母异位词
// 解法三：一个哈希表
public class ValidAnagram242_3 {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("abcc", "abcd"));
    }
    static class Solution {
        public boolean isAnagram(String s, String t) {
            // 长度不一致返回 false
            if (s.length() != t.length()) return false;
            Map<Character, Integer> hashMap = new HashMap<>();
            // 存入 s 的全部元素，value 加 1
            for (int i = 0; i < s.length(); i++) {
                hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
            }
            // 存入 t 的全部元素，value 减 1
            for (int i = 0; i < t.length(); i++) {
                hashMap.put(t.charAt(i),hashMap.getOrDefault(t.charAt(i),0)-1);
                // 如果 t 存在 s 所不具有的元素，那么对应的 value 值一定为 -1，小于 0，即返回 false
                if (hashMap.get(t.charAt(i))<0) return false;
            }
            return true;
        }
    }
}
