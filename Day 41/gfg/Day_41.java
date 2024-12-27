/*

https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1

Count pairs with given sum

Given an array arr[] and an integer target.
You have to find numbers of pairs in array arr[] which sums up to given target.

Examples:

Input: arr[] = [1, 5, 7, -1, 5], target = 6
Output: 
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5).
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0

-------------------------------------------------- CODE ----------------------------------------------------------------
class Solution {
    int countPairs(int arr[], int target) {
        // Create a HashMap to store the frequency of elements
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int count = 0;

        // Traverse the array
        for (int num : arr) {
            // Calculate the complement needed to form the target
            int complement = target - num;

            // Check if the complement exists in the map
            if (frequencyMap.containsKey(complement)) {
                // Increment the count by the frequency of the complement
                count += frequencyMap.get(complement);
            }

            // Add the current number to the frequency map or update its count
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}

*/