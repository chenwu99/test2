package LeetCode;

public class jzoffer38 {

    public String reverseLeftWords(String s, int n) {

        return s.substring(n,s.length()) + s.substring(0,n);

    }

}
