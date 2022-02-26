package com.tang.practice.leetcode.demo214;

public class Solution {

    public String shortestPalindrome(String s) {
        if(s.equals("")) return "";
        int Mp[] = new int[2050];
        StringBuilder str = new StringBuilder();
        //预处理
        str.append('$');
        str.append('#');
        for (int i = 0; i < s.length(); i++ )
        {
            str.append(s.charAt(i));
            str.append('#');
        }
        str.append('*');
        //遍历
        int MaxStr = 0, id = 0, maxLen = 0, start = 0;
        for (int i = 1; i < str.length() - 1; i++ )
        {
            //初始化Mp
            Mp[i] = MaxStr > i ? Math.min( Mp[2 * id - i], MaxStr - i) : 1;
            //暴力枚举
            while (str.charAt( i + Mp[i]) == str.charAt( i - Mp[i]))
                Mp[i]++; //此处可以添加判断条件
            //记录相对与当前位置，覆盖范围最右的回文子串
            if(i + Mp[i] > MaxStr)
            {
                MaxStr = i + Mp[i];
                id = i;
            }
            // 记录最长回文子串的长度和相应它在原始字符串中的起点
            if (Mp[i] > maxLen && i == Mp[i]) {
                maxLen = Mp[i];
                start = (i - maxLen);
            }
        }
        StringBuilder res = new StringBuilder();
        return res.append(s.substring(start / 2 + maxLen - 1)).reverse().toString() + s;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.shortestPalindrome("abb"));
        System.out.println(solution.shortestPalindrome("bba"));
        System.out.println(solution.shortestPalindrome("aabba"));
        System.out.println(solution.shortestPalindrome("abbacd"));
    }

}
