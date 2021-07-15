package IntroductionToDataStructure.Day07;

// 合并两个有序链表
// 递归
// 四个边界：
// 1、l1 是否为空，为空返回 l2
// 2、l2 是否为空，为空返回 l1
// 3、l1.val 是否小于 l2.val，小于则递归，返回 l1
// 4、l1.val 是否大于 l2.val，大于则递归，返回 l2
public class MergeTwoSortedLists21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(Solution.mergeTwoLists(l1, l2).next.next.next.next.next.val);
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
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) {   // l1 若为空链表，则返回 l2
                return l2;
            } else if (l2 == null) {    // l1 不为空链表，l2 若为空链表，返回 l1
                return l1;
            } else if (l1.val <l2.val) {    // l1 l2 都不为空链表，如果 l1 的结点数值 小于 l2 的结点数值
                l1.next = mergeTwoLists(l1.next, l2);   // 以 l1 为头结点，调用方法递归，若 l1 的 next 结点不为空，判断 l1 的 next 结点和 l2 结点的数值大小
                return l1;  // 以 l1 为头结点，以 l1 链表返回
            } else {    // 两个链表非空，且 l1 的数值 大于 l2 的数值
                l2.next = mergeTwoLists(l1, l2.next);   // 调用方法递归，若 l2 的 next 结点非空，判断 l1 和 l2 的 next 结点的数值大小
                return l2;  // 以 l2 为头结点，以 l2 链表返回
            }
        }
    }

}
