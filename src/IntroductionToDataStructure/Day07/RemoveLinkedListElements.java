package IntroductionToDataStructure.Day07;

// 移除链表元素
public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
        int val = 3;
        System.out.println(Solution.removeElements(head, val).val);
        System.out.println(Solution.removeElements(head, val).next.val);
        System.out.println(Solution.removeElements(head, val).next.next.val);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public static ListNode removeElements(ListNode head, int val) {
            ListNode prehead = new ListNode(-1);
            prehead.next = head;
            ListNode prev = prehead;

            while (prev.next != null) {
                if (prev.next.val == val) {
                    prev.next = prev.next.next;
                } else {
                    prev = prev.next;
                }
            }
            return prehead.next;
        }
    }

}
