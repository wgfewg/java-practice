package com.tang.practice.leetcode.demo206;


class ListNode {
int val;
ListNode next;
 ListNode(int x) { val = x; }
 }



class Solution {
    // 循环反转
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode curNext = null,curNow = null,curPre = null;
        curNow = head;
        while(curNow != null) {
            curNext = curNow.next;
            curNow.next = curPre;
            curPre = curNow;
            curNow = curNext;
        }
        return curPre;
    }
}
