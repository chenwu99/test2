package LeetCode.LianBiao;
import LeetCode.ListNode;

public class Solution {

    /**
     * 剑指 Offer 35. 复杂链表的复制
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {


        return null;
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
     * 剑指 Offer 52. 两个链表的第一个公共节点
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

}
