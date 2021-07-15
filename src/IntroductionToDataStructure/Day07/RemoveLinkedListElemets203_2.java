package IntroductionToDataStructure.Day07;

public class RemoveLinkedListElemets203_2 {

    public static void main(String[] args) {
        ListNode h = new ListNode(1,new ListNode(3,new ListNode(3,new ListNode(4))));
        int val = 4;
        System.out.println(Solution.removeElements(h, val).val);
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
            if (head == null) {
                return head;
            }
            head.next = removeElements(head.next, val);
            return head.val == val ? head.next : head;
        }
    }

}
