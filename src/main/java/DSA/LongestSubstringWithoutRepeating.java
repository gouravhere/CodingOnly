package DSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Question: Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with length 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b".

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke"..
 */

public class LongestSubstringWithoutRepeating {

    //Below code using hashmap
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            // If character seen before and inside current window
            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c) + 1; // move start to skip duplicate
            }

            map.put(c, end); // update last seen index
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    //Using hashSet

    public static int usingSet(String s){
        int start =0;
        int maxLength=0;

        Set<Character> set = new HashSet<>();
        for(int end = 0; end<s.length();end ++){
            char c = s.charAt(end);

            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxLength = Math.max(maxLength,end - start+1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3 ("abc")
        System.out.println(usingSet("bbbbb"));    // 1 ("b")
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3 ("wke")
        System.out.println(lengthOfLongestSubstring(""));         // 0 (empty string)
    }
}

