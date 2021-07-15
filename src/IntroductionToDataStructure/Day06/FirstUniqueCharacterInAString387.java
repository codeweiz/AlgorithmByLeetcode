package IntroductionToDataStructure.Day06;

import java.util.HashMap;
import java.util.Map;

// 字符串中的第一个唯一字符
public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        System.out.println(new Solution().firstUniqChar("loveleetcode"));
    }
    static class Solution {
        public int firstUniqChar(String s) {
            // 使用哈希表数据结构
            Map<Character, Integer> hashMap = new HashMap<>();
            // 循环遍历s，将整个字符串 s 写入哈希表中
            for (int i = 0; i < s.length(); i++) {
                // s.charAt(i) 为key
                // hashMap.getOrDefault(s.charAt(i),0)+1 为 value
                hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
            }
            // 从 0 开始，循环遍历s
            for (int i = 0; i < s.length(); i++) {
                // 如果 value == 1，则为第一个唯一字符
                if (hashMap.get(s.charAt(i))==1) {
                    return i;
                }
            }
            // 如果都不满足 value == 1 的条件，说明不存在不重复的字符，返回 -1
            return -1;
        }
    }
}
