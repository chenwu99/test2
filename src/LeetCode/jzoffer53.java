package LeetCode;

public class jzoffer53 {

    /**
     * 0 1 2 3 4 5 6 7
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int result = 0;
        if(nums.length == 1){
            return 1;
        }
        for (int k = 0; k < nums.length ; k++) {
            if(nums[k] != k)
                return k;
        }
        return result;
    }



}
