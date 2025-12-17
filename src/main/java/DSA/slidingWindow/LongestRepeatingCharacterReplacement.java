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
    }
    private static String result(int k , String s){
        String longestRepChar="";
        Map<Character,Integer> map = new HashMap<>();
        int left=0;
        for (int right =0; right<s.length();right++){
            char c = s.charAt(right);

        }
        return longestRepChar;
    }
}
