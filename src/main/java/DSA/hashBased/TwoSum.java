package DSA.hashBased;

import java.util.*;

/*
Problem:

Given an array of integers nums and an integer target, return the indices of the two numbers that add up to target.

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(answer(nums,target)));
    }
    public static int [] answer (int [] nums , int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
           int diff = target-nums[i];
            if (map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
