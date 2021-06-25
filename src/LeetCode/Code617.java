package LeetCode;

/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树[1,2,2,3,4,4,3] 是对称的。
 *
 * 但是下面这个[1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 */

/**
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
    target = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 */
public class Code617 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return false;
        }
        boolean b = judge(root.left,root.right);
        return b;
    }

    public boolean judge(TreeNode left,TreeNode right){
        if(left == null && right == null)
            return true;
        if(right == null || left == null || left.val != right.val)
            return false;
        return judge(left.left,right.right);
    }

}
/**
 * class Solution {
 *
 *     public boolean isSymmetric(TreeNode root) {
 *         return root == null ? true : recur(root.left, root.right);
 *     }
 *     boolean recur(TreeNode L, TreeNode R) {
 *         if(L == null && R == null) return true;
 *         if(L == null || R == null || L.val != R.val) return false;
 *         return recur(L.left, R.right) && recur(L.right, R.left);
 *     }
 *
 * }
 *
 */
