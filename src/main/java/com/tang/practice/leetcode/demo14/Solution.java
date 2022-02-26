package com.tang.practice.leetcode.demo14;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0 || strs[0].length() <= 0) return "";
        StringBuilder str = new StringBuilder();
        Boolean flag = true;
        int cur = 0;
        char curStr = '\0';
        while (flag) {
            str.append(curStr);
            if(cur <= strs[0].length() - 1)
                curStr = strs[0].charAt(cur);
            else{
                flag = false;
                break;
            }
            for (String s : strs) {
                if(cur > s.length() - 1 || curStr != s.charAt(cur)) {
                    flag = false;
                    break;
                }
            }
            cur++;
        }
        return str.deleteCharAt(0).toString();
    }

    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
//        String[] strs = {""};
        String[] strs = {"a"};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
    }

}
