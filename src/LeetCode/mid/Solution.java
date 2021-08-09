package LeetCode.mid;

/**
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class Solution {

    /**
     * 时间复杂度    O(logn)
     * 空间复杂度    O(1)
     * 需要注意的问题是将 中间的数据 和 最右侧的数据 做比较; 排序最快也要nlogn, 但是查看的话
     * @param numbers
     * @return
     */
    public int maxArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[i]) i = m;
            else if (numbers[m] < numbers[i]) j = m - 1;
            else i++;
        }
        return numbers[i];
    }

    /**
     * 旋转数组的最小数字
     * 输入：[3,4,5,1,2]
     * 输出：1
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {

        int i = 0,j = numbers.length - 1;
        while(i < j){
            int m = (i + j) / 2;
            if(numbers[m] > numbers[j]) i = m + 1;
            else if(numbers[m] < numbers[j]) j = m;
            else j--;
        }
        return numbers[i];
    }


    /**
     * 在排序数组中查找数字 I
     * 输入: nums = [5,7,7,8,8,10], target = 8
     * 输出: 2
     * @param nums
     * @param target
     * @return
     */
        public int search(int[] nums, int target) {
            // 搜索右边界 right
            int i = 0, j = nums.length - 1;
            while(i <= j) {
                int m = (i + j) / 2;
                if(nums[m] <= target) i = m + 1;
                else j = m - 1;
            }
            int right = i;
            // 若数组中无 target ，则提前返回
            if(j >= 0 && nums[j] != target) return 0;
            // 搜索左边界 right
            i = 0;
            while(i <= j) {
                int m = (i + j) / 2;
                if(nums[m] < target) i = m + 1;
                else j = m - 1;
            }
            int left = i;
            return right - left ;
        }

    /**
     *  0～n-1中缺失的数字
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
            int i = 0, j = nums.length - 1;
            while(i <= j) {
                int m = (i + j) / 2;
                if(nums[m] == m) i = m + 1;
                else j = m - 1;
            }
            return i;
        }




    public static void main(String[] args) {
        int[] a = {5,7,7,8,8,10};
        System.out.println(new Solution().search(a,8));
    }

}

