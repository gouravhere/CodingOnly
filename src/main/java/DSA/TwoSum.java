package DSA;

import java.util.HashSet;
import java.util.Set;

/*
Question: Two Sum Check

Given an array of integers nums and an integer k,
return true if there exist two distinct indices i and j in the array such that nums[i] + nums[j] == k. Otherwise, return false.

Example 1:
Input: nums = [2,7,11,15], k = 9
Output: true
Explanation: Because nums[0] + nums[1] == 9.

Example 2:
Input: nums = [3,2,4], k = 6
Output: true
Explanation: Because nums[1] + nums[2] == 6.

Example 3:
Input: nums = [3,3], k = 6
Output: true

Example 4:
Input: nums = [1,2,5], k = 10
Output: false
 */
public class TwoSum {

    public static void main (String[] args){
        int [] nums = {2,7,11,15};
        int k = 9;
        System.out.println(answer(nums,k));
    }

    public static boolean answer(int[] arr,int k){

        Set<Integer> seen = new HashSet();
        for(int num : arr){
            int needed = k-num;
            if(seen.contains(needed)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
