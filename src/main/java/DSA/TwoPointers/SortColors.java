package DSA.TwoPointers;

import java.util.Arrays;

/*
🧩 Problem: Sort Colors (Dutch National Flag)

LeetCode #75 — Medium

Question:
You are given an array nums with n objects colored red, white, or blue — represented by 0, 1, and 2.
Sort them in-place so that objects of the same color are adjacent, in the order red → white → blue (0, 1, 2).

Example:

Input:  nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Constraint: You cannot use a library sort function.
💡 Hint (don’t code yet):
Try using three pointers — low, mid, high.
low → for 0s
mid → for current element
high → for 2s
 */
public class SortColors {
    public static void main (String [] args){
        int [] nums = {2,0,1};
        int low =0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else if (nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
        }
        System.out.printf("Sorted Array : "+ Arrays.toString(nums));
    }
}
