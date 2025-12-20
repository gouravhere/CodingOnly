package DSA.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/*
⭐ Problem: Longest Repeating Character Replacement
🔥 What you are allowed to do:



You’re given:

a string s
a number k

You may replace at most k characters in the string with any character.

Your goal:
👉 Find the longest substring that can be turned into a string of the SAME character using at most k replacements.

🎯 Simple Example
Input:
s = "AABABBTA"
k = 1

 */
public class LongestRepeatingCharacterReplacement {
    public static void main (String [] args){
    String s = "AABAABBAA";
    int k = 2;
        System.out.printf(String.valueOf(characterReplacement(s,k)));
    }
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int maxFrequency = 0;

        Map<Character, Integer> freq = new HashMap<>();

        // sliding window loop will go here
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, freq.get(ch));
            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
