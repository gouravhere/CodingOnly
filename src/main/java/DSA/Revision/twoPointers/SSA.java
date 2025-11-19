package DSA.Revision.twoPointers;

import java.util.Arrays;

import static java.lang.Math.abs;

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
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare>rightSquare){
                result[index]=leftSquare;
                left++;
            }
            else{
                result[index]=rightSquare;
                right--;
            }
            index--;
        }

        System.out.println(Arrays.toString(result));


    }
}
