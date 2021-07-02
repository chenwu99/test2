package LeetCode.huisu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tiku46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<Integer>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }

    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }


    public List<List<Integer>> per(int[] nums) {
        //cnt  是当前数组遍历到第几位
        //list 是存储的是最后的结果
        //nums 是原来的数组
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>() ;
        if(len == 0){
            return list;
        }

        boolean[] visited = new boolean[len];

        List<Integer> ll = new ArrayList<>();
        dfs(nums , ll , 0 , len,visited , list);
        return list;

    }


    public  void dfs(int[] nums ,List<Integer> ll , int cnt ,int len , boolean[] visited ,List<List<Integer>> list){
        if(ll.size() == len){
            list.add(new ArrayList<>(ll));
            return;
        }
        for(int i = 0 ; i < len ; i++){
            if(!visited[i]){
                visited[i] = true;
                ll.add(nums[i]);
                dfs(nums ,ll ,cnt+1 , len,visited , list);
                visited[i] = false;
                ll.remove(ll.size()- 1);
            }
        }

    }



}

