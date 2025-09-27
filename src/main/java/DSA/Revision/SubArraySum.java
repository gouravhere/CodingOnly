package DSA.Revision;

import java.util.HashMap;
import java.util.Map;

/*
📌 Problem:
Given an array of integers and an integer k, return the total number of continuous subarrays whose sum equals to k.

Example:
Input: nums = [1, 1, 1], k = 2
Output: 2   (subarrays [1,1] at indices [0,1] and [1,2])


👉 Before coding, let’s build the intuition:

Normally, to find subarrays we’d use two loops = O(n²).

With prefix sum + hashmap, we can optimize to O(n).

Steps:

Maintain a running sum currentSum.

For each index, check if (currentSum - k) exists in the map.

If yes, it means there’s a subarray ending here with sum k.

Store counts of prefix sums in the map
 */
public class SubArraySum {

    public static void main (String [] args){
        int [] nums = {1,2,3};
        int k =3;
        System.out.println(subArraySum(nums,k));
    }

    public static int subArraySum(int [] nums , int k){
        int currSum = 0;
        int count = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        for (int num : nums) {
            currSum += num;

            // check if there is a prefix sum that makes subarray sum = k
            if (prefixSumMap.containsKey(currSum - k)) {
                count += prefixSumMap.get(currSum - k);
            }

            // update prefix sum count
            prefixSumMap.put(currSum, prefixSumMap.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}
