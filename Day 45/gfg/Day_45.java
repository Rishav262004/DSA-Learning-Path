/*

https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

Longest Consecutive Subsequence

Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that
elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

Examples:

Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
Output: 6
Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6.
These 6 numbers form the longest consecutive subsquence.

Input: arr[] = [1, 9, 3, 10, 4, 20, 2]
Output: 4
Explanation: 1, 2, 3, 4 is the longest consecutive subsequence.

Input: arr[] = [15, 13, 12, 14, 11, 10, 9]
Output: 7
Explanation: The longest consecutive subsequence is 9, 10, 11, 12, 13, 14, 15, which has a length of 7.

class Solution {
    // Function to return the length of the longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // If the array is empty, the longest consecutive subsequence length is 0
        if (arr.length == 0) {
            return 0;
        }

        // Step 1: Add all elements to a set for O(1) lookup time
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the array
        for (int num : arr) {
            // Check if num can be the start of a sequence
            if (!set.contains(num - 1)) {
                // Count the length of the consecutive sequence starting at num
                int currentNum = num;
                int currentStreak = 1;

                // Check for the next consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        // Step 3: Return the length of the longest consecutive subsequence
        return longestStreak;
    }
}









*/