package DSA;
/*
Problem 1: Kadane’s Algorithm (Maximum Subarray Sum)

👉 Problem statement:
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return that sum.
.
Example:

Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6.
Explanation: [4,-1,2,1] has the largest sum = 6

 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = 0;
        int maxSum = arr[0];  // start with first element

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // update maxSum every step
            maxSum = Math.max(maxSum, currentSum);

            // reset if currentSum < 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}

