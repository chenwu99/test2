package LeetCode;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 *
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head,int val) {
        if(head == null){
            return null;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode node = head,temp = newHead;
        while(node != null){
            if(node.val == val ){
                temp.next = node.next;
            }
            temp = node;
            node = node.next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(0);
        for (int i = 0; i < 5; i++) {
            ListNode node = new ListNode (i);
            temp.next = node;
            temp = node;
        }
        new Solution().deleteDuplicates(temp.next,2);
        ListNode node = temp.next;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}

//    public ListNode removeElements1(ListNode head, int val) {
//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode prev = dummyHead;
//        // 判断当前结点的后继结点是否为null
//        while (prev.next != null) {
//            // 如果当前结点的后继结点的值与给定值val相等
//            // 则需将其后继结点删除
//            if (prev.next.val == val) {
//                // 通过将当前结点后继结点的后继结点挂在当前结点之后
//                // 来删除当前结点的后继结点
//                prev.next = prev.next.next;
//            } else {
//                // 如果当前结点的后继结点的值与给定值不相等
//                // 则当前结点需要保留，因此prev向前移动一个位置
//                prev = prev.next;
//            }
//        }
//        return dummyHead.next;
//    }


