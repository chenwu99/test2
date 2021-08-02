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

    public int minArray(int[] numbers) {

        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j]) i = m;
            else if (numbers[m] < numbers[j]) j = m - 1;
            else j--;
        }
        return numbers[i];

    }

    public int minArray2(int[] numbers) {

        int i = 0, j = numbers.length - 1;
        for (int k = 0; k < numbers.length; k++) {
            if(numbers[k] > numbers[k+1]){
                return numbers[k+1];
            }
        }
        return numbers[0];

    }

//    3 4 5 1 2
//    1 2 3 4 5
//    5 4 3 2 1

    public int maxNum(int[] nums){

        int i = 0, j = nums.length - 1;
        while(i < j){

            int m = (i + j) / 2;
            if(nums[m] > j) i = m;
            else if(nums[m] < j) j = m;
            else i++;

        }
        return 0;

    }


    public static void main(String[] args) {
        int[] a = {2,2,2,0,1};
        System.out.println(new Solution().maxArray(a));
    }

}

