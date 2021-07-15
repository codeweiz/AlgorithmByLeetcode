package IntroductionToDataStructure.Day06;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("abcc", "aabbcdd"));
    }

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            // 使用哈希表数据结构
            Map<Character, Integer> map = new HashMap<>();
            // 循环遍历magazine
            for (int i = 0; i < magazine.length(); i++) {
                // 依次存入
                // key 为 magazine.charAt(i)
                // value 为 map.getOrDefault(magazine.charAt(i),0)+1
                map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
            }
            // 循环遍历ransomNote
            for (int i = 0; i < ransomNote.length(); i++) {
                // 首先判断哈希表中是否存在对应 key
                // 再判断 key 对应的 value 是否大于 1
                if (map.containsKey(ransomNote.charAt(i)) && map.get(ransomNote.charAt(i)) >= 1) {
                    // 更新 key 的 value 值，value--
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1);
                } else {
                    // 在循环中一旦不满足两个条件，返回 false
                    return false;
                }
            }
            // 循环结束，返回 true
            return true;
        }
    }
}
