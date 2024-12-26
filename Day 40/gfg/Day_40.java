/*

https://www.geeksforgeeks.org/problems/key-pair5616/1

Two Sum - Pair with Given Sum

Given an array arr[] of positive integers and another integer target.
Determine if there exists two distinct indices such that the sum of there elements is equals to target.

Examples:

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
Input: arr[] = [1, 2, 4, 3, 6], target = 11
Output: false
Explanation: None of the pair makes a sum of 11.

---------------------------------------------- CODE ---------------------------------------------------------------------

class Solution {
    boolean twoSum(int arr[], int target) {
        // Create a HashSet to store the numbers we have seen so far
        HashSet<Integer> seen = new HashSet<>();
        
        // Iterate through the array
        for (int num : arr) {
            // Calculate the required complement to form the target
            int complement = target - num;
            
            // Check if the complement is already in the set
            if (seen.contains(complement)) {
                return true; // Found a pair
            }
            
            // Add the current number to the set
            seen.add(num);
        }
        
        // If no pair is found, return false
        return false;
    }
}

*/