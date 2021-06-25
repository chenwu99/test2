package LeetCode;

import java.util.*;

import static javafx.scene.input.KeyCode.Q;

public class jzoffer32 {

    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
            list.add(node.val);

        }
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public List<List<Integer>> levelOrder_1(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            LinkedList<Integer>  l = new LinkedList<>();
            int n = queue.size();
            for(int i = 0; i < n; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                if(list.size() % 2 == 0)
                    l.addLast(node.val);
                else
                    l.addFirst(node.val);
            }
            list.add(l);
        }
        return list;

    }

}
