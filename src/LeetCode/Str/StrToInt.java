package LeetCode.Str;

import java.util.ArrayList;
import java.util.List;

/**
 *8. 字符串转换整数 (atoi)
 */

public class StrToInt {

    /**
     * 字符串转换整数 (atoi) 题目主要是超过最大长度int存储值;
     * @param s
     * @return
     */
    public int myAtoi(String s) {

        char[] c = s.toCharArray();
        int res = 0,max = Integer.MAX_VALUE;
        // 1、去除前导空格;
        int index = 0;
        while (index < c.length && c[index] == ' ') {
            index++;
        }
        if(index == c.length){
            return 0;
        }
        int sign = 1;
        if(c[index] == '-'){
            index ++;
            sign = -1;
        }else if(c[index] == '+'){
            index ++;
        }
        while(index < c.length){

            if(c[index] < '0' || c[index] > '9') break;
            if (res > Integer.MAX_VALUE /10  || (res == Integer.MAX_VALUE / 10 && ( c[index]  - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && ( c[index] - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (c[index] - '0');
            index++;

        }
        return res ;

    }

    /**
     * 输出字符串中的所有的数字;
     * @param s
     * @return
     */
    public int stringToInt(String s) {

        char[] c = s.toCharArray();
        System.out.println(c.length);
        int res = 0, max = Integer.MAX_VALUE, index = 0;

        int sign = 1;
        if(c[index] == '-'){
            index ++;
            sign = -1;
        }
        for (int i = index; i < c.length; i++) {
            if(c[i] < '0' || c[i] > '9') continue;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && ( c[i]  - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && ( c[i] - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (c[i] - '0');

        }
        return res ;

    }

    /**
     * 剑指 Offer 05. 替换空格
     * @param s
     */
    public String replaceSpace(String s) {

        StringBuffer str = new StringBuffer();
        for (char c : s.toCharArray()) {
            if(c == ' '){
                str.append("20%");
            }
            else {
                str.append(c);
            }
        }
        return str.toString();

    }

    /**
     * 剑指 Offer 58 - I. 翻转单词顺序
     * @param s
     * @return
     */
    public String reverseWords(String s) {

        StringBuffer stringBuffer = new StringBuffer();
        String[] strs = s.split(" ");
        System.out.println(strs.length);
        for (int i = strs.length - 1; i >= 0 ; i--) {

            if(strs[i].equals(" "))
                continue;
            if(i == 0)
                stringBuffer.append(strs[i]);
            else
                stringBuffer.append(strs[i]+" ");

        }
        return stringBuffer.toString().trim();

    }

    public static void main(String[] args) {
        StrToInt solution = new StrToInt();
        String st = "a good   example";
        System.out.println(solution.reverseWords(st));
        System.out.println(st.length());
    }




}
