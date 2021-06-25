package LeetCode;

public class S {
    /**
     * 反转
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode curr = head,newHead = head,temp = null;
        while(curr.next != null){
            temp = curr.next;
            curr.next = temp.next;
            temp.next = newHead;
            newHead = temp;

        }
        return newHead;
    }

}
/**
 *  temp = curr.next;
 *            curr.next = newHead;
 *            newHead = curr;
 *            curr = temp;
 */