package DSA.hashBased;

import java.util.HashSet;
import java.util.Set;

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
                int[] nums = {100, 4, 200, 1, 3, 2};

                // Step 1: put all numbers in a HashSet
                Set<Integer> set = new HashSet<>();
                for (int num : nums) {
                    // add num to set
                    set.add(num);
                }

                int longestStreak = 0;

                // Step 2: loop through nums
                for (int num : nums) {
                    // check if this num is the start of a sequence
                    if (!set.contains(num-1)) {
                        int currentNum = num;
                        int currentStreak = 1;

                        // expand sequence forward
                        while (set.contains(currentNum+num)) {
                            currentNum++;
                            currentStreak++;
                        }

                        // update max
                        longestStreak = Math.max(longestStreak, currentStreak);
                    }
                }

                System.out.println("Longest Consecutive Sequence Length = " + longestStreak);
            }
        }

