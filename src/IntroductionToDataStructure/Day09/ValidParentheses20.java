package IntroductionToDataStructure.Day09;

import java.util.*;

// 20.有效的括号
public class ValidParentheses20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(Solution.isValid(s));
    }

    static class Solution {
        public static boolean isValid(String s) {
            // 获取字符串的长度
            int n = s.length();
            // 如果字符串的长度为奇数，不可能为有效字符串，直接返回false
            if (n%2==1) {
                return false;
            }
            // new 一个 hashmap，存储右括号和左括号为 key 和 value
            Map<Character, Character> pairs = new HashMap<>();
            pairs.put(')','(');
            pairs.put(']','[');
            pairs.put('}','{');

            // 不建议直接 new 一个 Stack<>() 作为栈
            // Stack<Character> stack = new Stack<>();
            // 1.Stack 继承自 Vector，是线程安全的类，每个方法都加上了 synchronized 锁，加锁必定会影响性能
            // 2.Stack 继承自 Vector，暴露类 get/set 方法，可以进行随机访问，这与 栈 只能在一端插入删除的概念相背
            // 官方建议使用 Deque双端队列的继承类 LinkedList 或 ArrayDeque 代替 栈
            // ArrayDeque 底层使用数组存储，容量不够时需要扩容和数组拷贝，而且通常容量不会满，造成空间浪费
            // LinkedList 底层使用链表存储，每次 push() 都会产生新的 Node 结点，每个Node结点中存储val数据和next指针域，也会有额外的空间占用
            // 性能上 ArrayDeque 和 LinkedList 差不多，ArrayDeque 稍好于 LinkedList，差别很小，都可以使用

            Deque<Character> stack = new LinkedList<>();
            // 循环遍历一次字符串
            for (int i = 0; i < n; i++) {
                // 使用 ch 表示字符串的第 (i+1) 个值
                char ch = s.charAt(i);
                // 如果 hashmap 此前已经存储过 ch 作为 key 值
                if (pairs.containsKey(ch)) {
                    // 如果 栈为空 或者 栈的最顶端的元素不是 ch 作为 key 所对应的 value 值，返回 false
                    if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                        return false;
                    }
                    // 删除并返回双端队列的第一个元素，也即删除并返回栈顶元素
                    stack.pop();
                } else {
                    // 如果可以在不违反容量限制的情况下立即将元素推送到此双端队列表示的堆栈上（换句话说，在此双端队列的头部），如果当前没有可用空间，则抛出 {@code IllegalStateException}。
                    stack.push(ch);
                }
            }
            // 循环遍历结束，如果这是个有效的字符串，此前已经判断字符串的数量为偶数，所以栈为空就代表所有的括号都成对，返回true。否则一定存在不匹配的括号，返回false。
            return stack.isEmpty();
        }
    }
}
