package com.tang.practice.leetcode.demo408;

public class Solution {

    public boolean valid(String word, String abbr) {
        boolean res = true;
        char[] s = word.toCharArray();
        char[] a = abbr.toCharArray();
        StringBuilder strDigit = new StringBuilder();
        int cur = 0;
        for (int i = 0; i < a.length; i++, cur++) {
            if(Character.isDigit(a[i])) {
                strDigit.append(a[i]);
                continue;
            }
            else if(strDigit.length() > 0) {
                cur -= strDigit.length();
                cur += Integer.valueOf(strDigit.toString());
                strDigit.delete(0, strDigit.length());
            }
            if(cur >= s.length || s[cur] != a[i]) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.valid("apple", "a3e"));
        System.out.println(solution.valid("apple", "a4e"));
        System.out.println(solution.valid("apple", "a5e"));
        System.out.println(solution.valid("apple", "a6e"));
        System.out.println(solution.valid("apple", "a6e"));

    }

}
