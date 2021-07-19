package IntroductionToDataStructure.Day08;

import java.util.HashMap;
import java.util.Map;

// 删除排序链表中的重复元素
public class RemoveDuplicatesFromSortedList83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode () {}
        ListNode (int val) {
            this.val = val;
        }
        ListNode (int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode deleteDuplicates (ListNode head) {
            Map<Integer, Integer> hashMap = new HashMap<>();
            ListNode prev = new ListNode(-1);
            ListNode curr = head;
            while (curr != null) {
                prev.next = curr;
                ListNode nextNode = curr.next;
                hashMap.put(curr.val,hashMap.getOrDefault(curr.val,0)+1);
                if (hashMap.get(curr.val) > 1) {
                    curr.next = nextNode.next;
                    nextNode.next = null;
                }
                curr = nextNode;
            }
            return prev;
        }
    }
}
