package LeetCode;

public class jzoffer43 {

    /**
     * 数字的位数是1 2 3 4 5 6 ……n位 平均下来就是有(n（1+n）/2)/n = (n+1)/2 时间复杂度是logn;
     * 一共有n位数字，所以此算法时间复杂度是  O(nlogn);
     * @param n
     * @return
     */
    public int countDigitOne(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += getNumbers(n);
        }
        return result;
    }

    private int getNumbers(int n){
        int result = 0;
        while(n != 0){
            if(n % 10 == 1){
                result++;
            }
            n = n /10;
        }
        return result;
    }

    /**
     * 输入：matrix = [[1,2,3],
     *                [4,5,6],
     *                [7,8,9]]
     * 输出：[1,2,3,6,9,8,7,4,5]
     *
     * 输入：matrix = [  [1,2,3,4],
     *                  [5,6,7,8],
     *                  [9,10,11,12]]
     * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i++ % 2 == 1 ){

                }


            }

        }
        return null;
    }



}
