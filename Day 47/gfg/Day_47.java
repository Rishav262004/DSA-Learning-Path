/*

https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1

Subarrays with sum K
Difficulty: MediumAccuracy: 49.74%Submissions: 40K+Points: 4
Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.

Examples:

Input: arr = [10, 2, -2, -20, 10], k = -10
Output: 3
Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
Input: arr = [9, 4, 20, 3, 10, 5], k = 33
Output: 2
Explaination: Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.
Input: arr = [1, 3, 5], k = 0
Output: 0
Explaination: No subarray with 0 sum.

--------------------------------------------------------- CODE ---------------------------------------------------------

class Solution {

    public int countSubarrays(int arr[], int k) {

        int count = 0; // To store the count of subarrays
        int currentSum = 0; // To store the cumulative sum
        
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        for (int num : arr) {
            currentSum += num; // Update the cumulative sum
            
            if (currentSum == k) {
                count++;
            }
            
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }
            
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }
        
        return count; // Return the total count of subarrays
    }
}

*/