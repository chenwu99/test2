package LeetCode.LianBiao;
import LeetCode.ListNode;
import LeetCode.S;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    /**
     * 剑指 Offer 35. 复杂链表的复制 借助hash表，时间复杂度为O(n);
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur != null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    /**
     * 剑指 Offer 25. 合并两个排序的链表
     * 时间复杂度：O（M+N）
     * 空间复杂度：O（1）
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode p = l1,q = l2,result = new ListNode(0), end =result;
        while(p != null && q != null){

            if(p.val <= q.val){
                result.next = p;
                p = p.next;
            }else{
                result.next = q;
                q = q.next;
            }
            result = result.next;

        }

        if(p != null){
            result.next = p;
        }
        if(q != null){
            result.next = q;
        }
        return end.next;
    }

    /**
     * 剑指 Offer 52. 两个链表的第一个公共节点 思路就是把这两个链表弄成环，一直便利，肯定能找到公共节点;
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p = headA,q = headB;
        while(p != q){

            if(p != null){
                p = p.next;
            }else{
                p.next = headB;
            }
            if(q != null){
                q = q.next;
            }else{
                q.next = headA;
            }

        }
        return p;
    }

    /**
     * 反转链表
     * 1-2-3-4->5->NULL
     * 5->4->3->2->1->NULL
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode cur = head,pre = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;

    }

    /**
     * 链表中倒数第k个节点
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode slow = head,fast = head;
        while(k > 0){
            fast = fast.next;
            k--;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }


}
