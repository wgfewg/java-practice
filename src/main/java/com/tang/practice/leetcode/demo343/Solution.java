package com.tang.practice.leetcode.demo343;

public class Solution {

    public int intPow(int a, int b){
        int ans = 1;
        while(b > 0){
            if( (b & 1) == 1) ans = ans * a;
            b >>= 1;
            a = a * a;
        }
        return ans;
    }
    public int integerBreak(int n) {
        int a = (int) n / 3;
        int b = n % 3;
        int res = this.intPow(3, a);
        switch (b){
            case 1: return ( res / 3 ) * 4;
            case 2: return res * 2;
            case 3: return res * 3;
            default: return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(3));
        System.out.println(solution.integerBreak(5));
        System.out.println(solution.integerBreak(6));
        System.out.println(solution.integerBreak(7));
        System.out.println(solution.integerBreak(8));
        System.out.println(solution.integerBreak(9));
        System.out.println(solution.integerBreak(10));
        System.out.println(solution.integerBreak(11));
        System.out.println(solution.integerBreak(32));
        System.out.println(solution.integerBreak(33));
        System.out.println(solution.integerBreak(58));
    }

}
