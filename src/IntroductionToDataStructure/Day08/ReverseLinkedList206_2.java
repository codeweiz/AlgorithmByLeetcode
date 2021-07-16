package IntroductionToDataStructure.Day08;

// 迭代 从第一个开始完成基本逻辑，循环遍历，直到最后，所有结点都完成基本逻辑
public class ReverseLinkedList206_2 {

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
        public ListNode reverseList(ListNode head) {
            // 虚拟结点 prev 为 null
            ListNode prev = null;
            // 虚拟结点 curr 为 head 头结点
            ListNode curr = head;
            // 循环直至 curr 为 null
            while (curr != null) {
                // 虚拟结点 nextNode 始终为 curr 的下一个结点
                ListNode nextNode = curr.next;
                // curr 指向 prev，一开始的 null
                curr.next = prev;
                // prev 向前移动到 curr 结点的位置
                prev = curr;
                // curr 移动到 curr 的下一个结点 nextNode 的位置
                curr = nextNode;
            }
            // 循环结束，最终 curr 为 null
            // prev 在 curr 的前面
            return prev;
        }
    }
}
