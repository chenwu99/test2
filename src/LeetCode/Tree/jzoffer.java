package LeetCode.Tree;

import java.util.*;

/**
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 示例:
 给定如下二叉树，以及目标 target = 22，

 5
 / \
 4   8
 /   / \
 11  13  4
 /  \    / \
 7    2  5   1

 [
 [5,4,11,2],
 [5,8,4,5]
 ]
 */
public class jzoffer {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null){
            while(node != null){
                l.add(node.val);
                stack.add(node);
                node = node.left;
            }
            TreeNode n = stack.pop();
            n = n.right;
        }
        return l;
    }

    /**
     * 二叉树中和为某一值的路径
     * @param root
     * @param target
     * @return
     */

    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Queue<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return ret;
    }

    public void dfs(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, target);
        dfs(root.right, target);
        path.poll();
    }

}
