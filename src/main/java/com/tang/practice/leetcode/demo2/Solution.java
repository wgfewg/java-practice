package com.tang.practice.leetcode.demo2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode res = root;
        ListNode oneCur = l1;
        ListNode towCur = l2;
        int sum = 0;
        while(oneCur != null || towCur != null){
            int oneVal = oneCur != null ? oneCur.val : 0;
            int towVal = towCur != null ? towCur.val : 0;
            sum /= 10;
            sum = oneVal + towVal + sum;
            res.next = new ListNode(sum % 10);
            res = res.next;
            if(oneCur != null) oneCur = oneCur.next;
            if(towCur != null) towCur = towCur.next;
        }
        if(sum > 9) res.next = new ListNode(sum / 10);
        return root.next;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode root = new ListNode(0);
//        ListNode res = root;
//        ListNode oneCur = l1;
//        ListNode towCur = l2;
//        while(res != null){
//            int oneVal = oneCur != null ? 0 : oneCur.val;
//            int towVal = towCur != null ? 0 : towCur.val;
//            res.val = oneVal + towVal + res.val;
//            boolean flag = false;
//            if(res.val > 9){
//                res.val -= 10;
//                flag = true;
//            }
//            // 判断会不会产生下一个节点
//            if((oneCur != null && oneCur.next != null) || (towCur != null && towCur.next != null) || flag) {
//                res.next = new ListNode(0);
//                res = res.next;
//                if(oneCur != null) oneCur = oneCur.next;
//                if(towCur != null) towCur = towCur.next;
//                if(flag)  res.val += 1;
//            }
//            else res = res.next;
//        }
//        return root;
//    }
}
