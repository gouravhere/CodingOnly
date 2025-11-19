package DSA.Revision.slidingWindow;
/*
Max Sum Subarray of Size K

Given an array:
[2, 1, 5, 1, 3, 2]
and k = 3

Return the maximum sum of any subarray of size 3.

Example:
[5, 1, 3] → sum = 9
 */
public class MaxSumSubarrayOfSizeK {

    public static void main (String [] args){
        int [] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumWindow(arr, k));
    }

    public static int maxSumWindow(int[] arr, int k) {
        if (k > arr.length || k <= 0) return 0;

        int windowSum = 0;
        // sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // slide the window
        for (int end = k; end < arr.length; end++) {
            windowSum = windowSum - arr[end - k] + arr[end];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
