package DSA.Revision.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int left =0;
        Map<Character,Integer> map = new HashMap<>();
        for (int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            maxlen = Math.max(maxlen,right - left +1);
        }

        return maxlen;
    }
}
