package LeetCode.Tree;


import java.util.LinkedList;
import java.util.Queue;

public class jzoffer55 {

    /**
     * 递归
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left > right){
            return left + 1;
        }else{
            return right + 1;
        }

    }

    /**
     * 层次遍历
     */
    public int max(TreeNode root) {

        int height = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            height++;
        }
        return height;
    }



}
