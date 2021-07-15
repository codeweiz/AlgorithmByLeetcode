package IntroductionToDataStructure.Day07;

public class MergeTwoSortedLists21_2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(Solution.mergeTwoLists(l1, l2).next.next.next.val);
    }

    // ListNode 链表结点类
    static public class ListNode {
        // 属性
        int val;
        ListNode next;
        // 无参构造
        ListNode() {}
        // 有参构造
        ListNode(int val) {
            this.val = val;
        }
        // 有参构造
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode prehead = new ListNode(-1);
            ListNode prev = prehead;
            while (l1!=null && l2!=null) {
                if (l1.val < l2.val) {
                    prev.next = l1;
                    l1 = l1.next;
                } else {
                    prev.next = l2;
                    l2 = l2.next;
                }
                prev = prev.next;
            }
            prev.next = l1 == null ? l2 : l1;
            return prehead.next;
        }
    }
}
