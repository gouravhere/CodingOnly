package DSA;

import java.util.*;

/*
We’re solving Subarray Sum = Target.
Example: arr = [2,3,-2,5,-3], target = 5.
 */
public class contiguousSum {
    public static void main (String [] args){
        int [] arr = {2,3,-2,5,-3};
        int k = 5;
        findSubarrays(arr, k);
    }
    private static void findSubarrays(int [] arr , int k){
        int currentSum =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(map.containsKey(currentSum-k)){
                count+=map.get(currentSum-k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        System.out.println(count);

    }
}
