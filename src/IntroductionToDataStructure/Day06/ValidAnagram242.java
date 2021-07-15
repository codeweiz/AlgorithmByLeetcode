package IntroductionToDataStructure.Day06;

import java.util.HashMap;
import java.util.Map;

// 有效的字母异位词
// 解法一：两个哈希表比较
public class ValidAnagram242 {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("abcc", "abcd"));
    }
    static class Solution {
        public boolean isAnagram(String s, String t) {
            // 如果 s 和 t 的字符串长度不相同，直接返回 false
            if (s.length() != t.length()) {
                return false;
            }
            // 维护两个hashMap，分别存储 s 和 t
            Map<Character, Integer> hashMap1 = new HashMap<>();
            Map<Character, Integer> hashMap2 = new HashMap<>();
            // 循环遍历 s，存入 字符 和 字符的次数 为 key 和 value
            for (int i = 0; i < s.length(); i++) {
                hashMap1.put(s.charAt(i),hashMap1.getOrDefault(s.charAt(i),0)+1);
            }
            // 循环遍历 t，存入 字符 和 字符的次数 为 key 和 value
            for (int i = 0; i < t.length(); i++) {
                hashMap2.put(t.charAt(i),hashMap2.getOrDefault(t.charAt(i),0)+1);
            }
            // 哈希表相等返回 true，不相等返回 false
            return hashMap1.equals(hashMap2);
        }
    }
}
