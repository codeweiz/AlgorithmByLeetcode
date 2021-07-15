package IntroductionToDataStructure.Day06;

import java.util.Arrays;

// 有效的字母异位词
// 解法二：字符串 转 字符数组，排序
public class ValidAnagram242_2 {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("abcc", "abcd"));
    }
     static class Solution {
        public boolean isAnagram(String s, String t) {
            // 如果两个字符串长度不相同，直接返回 false
            if (s.length() != t.length()) return false;
            // 将两个字符串 转换成 字符数组
            char[] charsS = s.toCharArray();
            char[] charsT = t.toCharArray();
            // 对两个字符数组排序
            Arrays.sort(charsS);
            Arrays.sort(charsT);
            // 返回两个字符数组的相等情况
            return Arrays.equals(charsS, charsT);
        }
    }
}
