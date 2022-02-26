package com.tang.practice.leetcode.demo56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        // 按第一位排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        LinkedList<int[]> res = new LinkedList<>();
        int[] cur = null;
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            cur = res.getLast();
            // 被包含，不添加
            if(cur[1] >= intervals[i][1]) continue;
            // 有交集，更新边界
            if(cur[1] >= intervals[i][0]) {
                cur[1] = intervals[i][1];
                continue;
            }
            // 无交集，加入集合
            res.add(intervals[i]);
        }
        return res.toArray(new int[res.size()][]);
    }
}