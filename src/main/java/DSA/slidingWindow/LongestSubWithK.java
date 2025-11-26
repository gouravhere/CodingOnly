package DSA.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubWithK {
    public static void main(String[] args){
        String s = "eceba";
        int k = 2;
        System.out.println(LongestSubstring(s,k));
    }
    private static String LongestSubstring(String s,int k) {
        int left =0;
        int startIndexOfMax = 0;
        int maxLen=0;
        Map<Character,Integer> freq = new HashMap<>();
        for(int right =0; right<s.length();right++){
            char ch = s.charAt(right);

        }
        return s;
    }
}
