package LeetCode.Tree;

public class jzoffer28 {

    private int flag = 0;
    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return true;
        }
        judge(root.left,root.right);
        if(flag == 1){
            return false;
        }else {
            return true;
        }

    }

    public void judge(TreeNode left,TreeNode right){

        if((left == null && right == null) || left.val == right.val){
           flag = 0;
        }
        if(left == null || right == null || left.val != right.val){
            flag = 1;
            return;
        }
        judge(left.left,right.right);

    }

}
