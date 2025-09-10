package DSA.hashBased;
/*
LeetCode 128
❓ Problem

You are given an unsorted array of integers.
Return the length of the longest consecutive sequence.

Example:

Input: [100, 4, 200, 1, 3, 2]
Output: 4
Explanation: The sequence is [1, 2, 3, 4]

🔑 Key Idea

A HashSet is great here because we want fast lookups.

For each number, check if it’s the start of a sequence.
(A number is the start if num - 1 is not in the set).

Then count forward (num + 1, num + 2, …) to find how long the sequence goes.

Keep track of the max length.
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
}
