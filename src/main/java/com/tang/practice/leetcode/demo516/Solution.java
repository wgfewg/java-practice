package com.tang.practice.leetcode.demo516;

public class Solution {

    public int longestPalindromeSubseq(String s) {
        int Mp[] = new int[1050];
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
        int MaxStr = 0, id = 0, ans = 0;
        for (int i = 1; i < str.length() - 1; i++ )
        {
            //初始化Mp
            Mp[i] = MaxStr > i ? Math.min( Mp[ 2 * id - i], MaxStr - i) : 1;
            //暴力枚举
            while (str.charAt( i + Mp[i]) == str.charAt( i - Mp[i]))
                Mp[i]++; //此处可以添加判断条件
            //记录相对与当前位置，覆盖范围最右的回文子串
            if(i + Mp[i] > MaxStr)
            {
                MaxStr = i + Mp[i];
                id = i;
            }
        }
        for (int i = 1; i < str.length() - 1; i++)
            ans = Math.max(ans, Mp[i] - 1);
        // 找出最大回文子串。注意：id 记录的并不是最大的位置
        return ans;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindromeSubseq("abb"));
        System.out.println(solution.longestPalindromeSubseq("bba"));
        System.out.println(solution.longestPalindromeSubseq("aabba"));
        System.out.println(solution.longestPalindromeSubseq("abbacd"));
    }

}
