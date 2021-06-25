package LeetCode.Tree;

import LeetCode.S;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class jzoffer54 {

    public int kthLargest(TreeNode root, int k) {

        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                l.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        Collections.reverse(l);
        return l.get(k-1);

    }


}
