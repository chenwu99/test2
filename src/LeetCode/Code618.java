package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code618 {
    public static int[] exchange(int[] nums) {

        int i = 0 , j = nums.length-1, temp;
        while(i < j){
            if(nums[i] % 2 == 1 ){
                i++;
                continue;
            }
            if(nums[j] % 2 == 0 ){
                j--;
                continue;
            }
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

//    public int[] reversePrint(ListNode head) {
//        ListNode node = head;
//        List<Integer> list = new ArrayList<>();
//        while(node != null){
//            int n = node.val;
//            list.add(0,n);
//            node = node.next;
//        }
//        Object[] o = list.toArray();
//        int[] nums = new int[o.length];
//        for (int i = 0; i < o.length; i++) {
//            nums[i] = (int)o[i];
//        }
//        return nums;
//    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        while(node != null){
            int n = node.val;
            stack.push(n);
            node = node.next;
        }
        while (stack.isEmpty()){
            int n = stack.pop();
        }
        return null;
    }

    /**
     * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
     * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
     * 输入: 12258
     * 输出: 5
     * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
     */
    public int translateNum(int num) {


        return 0;

    }

    public static void main(String[] args) {



    }

}
