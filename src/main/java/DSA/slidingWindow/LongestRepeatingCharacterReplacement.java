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
s = "AABABBA"
k = 1

 */
public class LongestRepeatingCharacterReplacement {
    public static void main (String [] args){
    String s = "AABABBA";
    int k = 1;
        System.out.printf(String.valueOf(characterReplacement(s,k)));
    }
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int maxFrequency = 0;

        Map<Character, Integer> freq = new HashMap<>();

        // sliding window loop will go here

        return maxLen;
    }
}
