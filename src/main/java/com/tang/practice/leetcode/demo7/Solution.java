package com.tang.practice.leetcode.demo7;

public class Solution {

    private final long maxInt = (1 << 31 );
    private final long minInt = -(1 << 31 - 1);

    public int reverse(int x) {
        boolean flag = true; // 是否为正整数
        int input = x;
        if(input < 0) {
            flag = false;
            input = -input;
        }
        int i = 0;
        long res = 0;
        while(input > 0) {
            res *= 10;
            res += (input % 10);
            input /= 10;
        }
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        if(flag)
            return (int) res;
        else
            return (int)-res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(-2147483412));
        System.out.println(solution.reverse(1534236469));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
    }

}
