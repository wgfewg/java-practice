package com.tang.practice.leetcode.demo3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        int max = 0;
        int flag = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if((s.length() - i) < max) break;
            while( flag < s.length() && !map.containsKey(s.charAt(flag))) {
                map.put(s.charAt(flag), flag);
                flag++;
            }
            if((flag - i) > max) max = (flag - i);
            map.remove(s.charAt(i));
        }
        return max;
    }

//    public int lengthOfLongestSubstring(String s) {
//        if(s.length() == 1) return 1;
//        int res = 0;
//        int max = 0;
//        Set<Character> set = new HashSet<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            if((s.length() - i) < max) break;
//            set.add(s.charAt(i));
//            res++;
//            for (int j = i + 1; j < s.length(); j++) {
//                if(set.contains(s.charAt(j))) break;
//                set.add(s.charAt(j));
//                res++;
//            }
//            set.clear();
//            if(res > max) max = res;
//            res = 0;
//        }
//        return max;
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLongestSubstring("abcabcbb");
    }

}
