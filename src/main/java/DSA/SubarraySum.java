package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Problem statement:
“Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.”

Example:

Input: nums = [1, 2, 3], k = 3
Output: 2
Explanation: [1,2] and [3] are the subarrays.
 */
public class SubarraySum {
    public static void main (String [] args){
        int [] nums = {1,2,3};
        int k =3;
        System.out.println(subArraySum(nums,k));
    }

    private static int subArraySum(int [] nums , int k){
        int subArray=0;
        //if told to give pairs
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
           int sum=0;
            List<Integer> temp = new ArrayList<>();
            for(int j =i; j<nums.length;j++){
                sum+=nums[j];
                temp.add(nums[j]);
                if(sum==k){
                    result.add(new ArrayList<>(temp));
                    subArray++;
                }
            }
        }
        System.out.println("Pairs : "+result);
        return subArray;
    }

    private static int bestApproach(int [] nums , int k){
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // base case: sum 0 has appeared once

        int currSum = 0;
        int count = 0;

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
