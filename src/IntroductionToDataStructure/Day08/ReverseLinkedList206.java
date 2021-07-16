package IntroductionToDataStructure.Day08;

// 递归
public class ReverseLinkedList206 {

    public class ListNode {
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

    class Solution {
        public ListNode reverseList(ListNode head) {
            // 递归终止条件：当前为空，或者下一个结点为空
            if (head == null || head.next == null) {
                return head;
            }
            // newHead 表示最后一个结点
            ListNode newHead = reverseList(head.next);
            // 1->2->3->4->5，此时 newHead 就是 5
            // head 是 4，head 的下一个是 5，下下一个是空
            // 4->next == 5     4 的下一个结点是 5
            // 5->next = 4      5 的下一个结点指向 4
            // 4->next->next = 4    把 4->5 转为 5->4
            head.next.next = head;
            // head.next = null; 防止链表循环
            head.next = null;
            // 每层递归函数都返回newHead，也就是最后一个结点
            return newHead;
        }
    }
}
