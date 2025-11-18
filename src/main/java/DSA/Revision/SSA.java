package DSA.Revision;

import java.util.Arrays;

/*
Problem: Squares of a Sorted Array (Two Pointers)
Given a sorted array with negative and positive numbers:

[-5, -3, -2, -1, 4, 6]
Return the squares in sorted order:

[1,4,9,16,25,36]
 */
public class SSA {
    public static void main (String [] args){
        int[] nums = {-5, -3, -2, -1, 4, 6};

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        while (left <= right) {

            // TODO: compute leftSquare
            // TODO: compute rightSquare

            // TODO: compare leftSquare & rightSquare
            // - put larger one at result[index]
            // - move left or right pointer
            // - index--;

        }

        // print result
        System.out.println(Arrays.toString(result));


    }
}
