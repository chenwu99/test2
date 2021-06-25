package LeetCode.Tree;

public class jzoffer27 {

    public TreeNode mirrorTree(TreeNode root) {

        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;

    }

}
