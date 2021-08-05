package sort;

import java.util.Scanner;

/**
 *
 */
public class QuickSort {


    public int majorityElement(int[] nums) {
        int start = 0,end = nums.length -1;
        int position = partion(start,end,nums);
        int mid = nums.length/2;
        while(position != mid){
            if(position < mid){
                end = position - 1;
                partion(start,end,nums);
            }else{
                start = position + 1;
                partion(start,end,nums);
            }
        }
        return nums[mid];
    }



    public void judge(int p,int r,int[] nums){
        int position = partion(p,r,nums);
        if(position == nums.length/2){
            return ;
        } else if(position > nums.length/2){
            judge(p,position-1,nums);
        }else{
            judge(position+1,r,nums);
        }
    }

    public char[] sortChar(char[] chars){

        int i = 0,j = chars.length-1;
        while(i < j){
            if( (chars[j] >= 'a' && chars[j] <= 'z' )  && chars[i] >= 'A' && chars[i] <= 'Z'){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            i++;
            j--;
        }
        return chars;

    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0){
            return new int[0];
        }
        int[] nums = new int[k];
        int start = 0,end = arr.length -1;
        int position = partion(start,end,arr);
        while(position + 1 != k){
            if(position + 1 > k){//在左侧;
                end = position - 1;
                position = partion(start,end,arr);
            }else{
                start = position + 1;
                position = partion(start,end,arr);
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i] =arr[i];
        }
        return nums;
    }


    public void quickSort(int[] nums,int l,int r){
        if(l >= r){
            return ;
        }
        int p = partion(l,r,nums);
        quickSort(nums,l,p-1);
        quickSort(nums,p+1,r);
    }

    public void random(int[] nums,int l,int r,int k){
        if(l >= r){
            return;
        }
        int position = partion(l,r,nums);
//        在右侧;
        if(position - l + 1 < k){
            random(nums,position + 1,r,k - (position - l + 1));
        } else if(position - l + 1 == k){
            return ;
        }else{
            random(nums,l,position-1,k);
        }
    }


    /**
     * 快排思想：利用插入排序的思想，在i之前保持nums数组之前是小于proir的，之后交换i和proir，使其处在一个该有的位置;
     * @param p
     * @param r
     * @param nums
     * @return
     */
    public int partion(int p,int r,int[] nums){
        int i = p;
        int proir = nums[r];
        for (int j = p; j < r; j++) {
            if(nums[j] <= proir){
                swap(i,j,nums);
                i++;//保持i位置是大于proir;
            }
        }
        swap(i,r,nums);
        return i;
    }

    public static void swap(int a,int b,int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {


    }




}
