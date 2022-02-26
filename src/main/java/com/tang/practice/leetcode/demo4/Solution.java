package com.tang.practice.leetcode.demo4;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        return 0;
    }


//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if(nums1 == null || nums1.length == 0) return calculate(nums2);
//        if(nums2 == null || nums2.length == 0) return calculate(nums1);
//        // 先合并两个数组
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int curOne = 0;
//        int curTow = 0;
//        while(curOne < nums1.length || curTow < nums2.length){
//            if(curOne >= nums1.length){
//                list.add(nums2[curTow]);
//                curTow++;
//                continue;
//            }
//            if(curTow >= nums2.length){
//                list.add(nums1[curOne]);
//                curOne++;
//                continue;
//            }
//            if(nums1[curOne] < nums2[curTow]){
//                list.add(nums1[curOne]);
//                curOne++;
//            } else {
//                list.add(nums2[curTow]);
//                curTow++;
//            }
//        }
//        return calculate(list.stream().mapToInt(Integer::valueOf).toArray());
//    }
//    // 计算中位数
//    public double calculate(int[] nums){
//        if(nums == null) return 0;
//        double res = 0;
//        if(nums.length % 2 == 1){
//            res = nums[nums.length / 2];
//        } else {
//            double a = nums[nums.length / 2];
//            double b = nums[(nums.length / 2) - 1];
//            res = (a + b) / 2;
//        }
//        return res;
//    }

    public static void main(String[] args) {
//        int[] a = new int[]{ 1, 3, 6, 8};
//        int[] b = new int[]{ 2, 4, 5, 6};
        int[] a = new int[]{ 1, 2};
        int[] b = new int[]{ 3, 4};
        Solution solution = new Solution();
        solution.findMedianSortedArrays(a, b);
    }

}
