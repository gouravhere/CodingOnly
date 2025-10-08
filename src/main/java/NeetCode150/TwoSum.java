package NeetCode150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
****************************

Correct Approach (Logic Only, No Full Code)
Create a HashMap<Integer, Integer> map to store number → index.
Loop over nums:
For each number num, compute diff = target - num.
If map contains diff, return [map.get(diff), i].
Else, put num in the map with its index.
Example Walkthrough
nums = [2,7,11,15], target = 9
i=0 → num=2 → diff=7 → map empty → store 2→0
i=1 → num=7 → diff=2 → map contains 2 ✅ → return [0,1]
**
****************************
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int diff= 0;
        for(int i=0;i<nums.length;i++) {
            diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int []{};
    }
    public static void main (String[] args){
        int [] nums = {2,7,11,15};
        int k = 9;
        System.out.println(Arrays.toString(twoSum(nums,k)));
    }
}
