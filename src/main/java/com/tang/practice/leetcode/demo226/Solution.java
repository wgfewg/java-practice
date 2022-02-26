package com.tang.practice.leetcode.demo226;


import java.util.LinkedList;

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
 }


class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        TreeNode curNow, child;
        list.add(root);
        while(!list.isEmpty()){
            curNow = list.pop();
            if(curNow.left != null) list.add(curNow.left);
            if(curNow.right != null) list.add(curNow.right);
            child = curNow.left;
            curNow.left = curNow.right;
            curNow.right = child;
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.invertTree(new TreeNode(1));
    }
}
