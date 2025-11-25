package DSA.Revision.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ReturnLongestSubstr {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(LongestSubstring(s));
    }

    private static String LongestSubstring(String s) {
        int left =0;
        int startIndexOfMax = 0;
        int maxLen=0;
        Map<Character,Integer> map = new HashMap<>();
        for (int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            int currentWindowLength = right - left + 1;

            if (currentWindowLength > maxLen) {
                maxLen = currentWindowLength;
                startIndexOfMax = left;
            }
        }
        return s.substring(startIndexOfMax, startIndexOfMax + maxLen);

    }
}
