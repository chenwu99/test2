package LeetCode;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 *
 * 初始化： 票数统计 votes = 0 ， 众数 x；
 * 循环： 遍历数组 nums 中的每个数字 num;
 *      当 票数 votes 等于 0 ，则假设当前数字 num 是众数；
 *      当 num = x 时，票数 votes 自增 1 ；当 num != x 时，票数 votes 自减 1 ；
 * 返回值： 返回 x 即可；
 *
 */
public class Code616 {

    /**
     * // 出现次数超过数组长度的一半，说明剩余数字的个数小于该数字的个数
     *         // count代表当前数字的绝对个数（比如有2个3和4个5，则5的绝对个数就是2个）
     *         // goal代表当前统计的是哪个数字
     *         int count = 0, goal = 0;
     *         for (int i : nums) {
     *             // 若绝对个数为0，则当前遍历到的数字作为要统计个数的数字
     *             if (count == 0) goal = i;
     *             if (goal == i) {
     *                 // 遍历到的数字与正在统计个数的数字相同
     *                 // 该数字个数加一
     *                 count++;
     *             } else {
     *                 // 否则个数减一
     *                 count--;
     *             }
     *         }
     *         // for循环结束之后，goal则就是绝对个数最多的数字
     *         // 即代表其在数组中出现次数超过数组长度的一半
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int x = 0, votes = 0; //票数;
        for(int num : nums){
            if(votes == 0){
                x = num;
            }
            if(num == x){
                votes = votes + 1;
            }else{
                votes = votes - 1;
            }
        }
        return x;
    }

    /**
     * 输入： [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

    /**
     * 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
     * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
     * 输入: n = 5, m = 3
     */
    public int lastRemaining(int n, int m) {


        return 0;
    }

}
