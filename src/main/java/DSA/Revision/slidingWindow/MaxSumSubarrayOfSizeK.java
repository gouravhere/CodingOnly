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

    private static int maxSumWindow(int[] arr, int k) {

        if(k>arr.length){
            return 0;
        }
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // 2) compute sum of first k elements
            for (int i=0;i<k;i++){
                windowSum=+arr[i];
            }
            maxSum=windowSum;
        // 3) slide the window from i = k to arr.length-1
        // slide the window
        for (int end = k; end < arr.length; end++) {
            windowSum = windowSum - arr[end - k] + arr[end];
            maxSum = Math.max(maxSum, windowSum);
        }
        //    windowSum = windowSum - arr[i - k] + arr[i]
        //    update maxSum
        return maxSum;
    }
}
