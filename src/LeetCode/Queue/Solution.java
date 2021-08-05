package LeetCode.Queue;

import LeetCode.LianBiao.Node;

import java.util.Stack;

public class Solution {

    class CQueue{

        Stack<Integer> s1,s2;
        public CQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void appendTail(int value) {
            s1.push(value);
        }

        public int deleteHead() {
            int result = 0;
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            if(s2.isEmpty()){
                result = -1;
            } else{
                result =  s2.pop();
            }
            return result;
        }

    }

}
