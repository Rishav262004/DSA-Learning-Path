/*

https://www.geeksforgeeks.org/problems/count-subarray-with-given-xor/1

Count Subarrays with given XOR

Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.

Examples:

Input: arr[] = [4, 2, 2, 6, 4], k = 6
Output: 4
Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. 
Hence, the answer is 4.
Input: arr[] = [5, 6, 7, 8, 9], k = 5
Output: 2
Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]. Hence, the answer is 2.
 
Input: arr[] = [1, 1, 1, 1], k = 0
Output: 4
Explanation: The subarrays are [1, 1], [1, 1], [1, 1] and [1, 1, 1, 1]

----------------------------------------------------------------- CODE -------------------------------------------------------------------

class Solution {
    public long subarrayXor(int arr[], int k) {
        // HashMap to store frequency of prefix XORs
        HashMap<Integer, Integer> freq = new HashMap<>();
        int prefixXOR = 0;
        long count = 0;

        for (int num : arr) {
            // Update prefixXOR
            prefixXOR ^= num;

            // If prefixXOR equals k, increment count
            if (prefixXOR == k) {
                count++;
            }

            // Check if prefixXOR ^ k exists in the hashmap
            int targetXOR = prefixXOR ^ k;
            if (freq.containsKey(targetXOR)) {
                count += freq.get(targetXOR);
            }

            // Update frequency of the current prefixXOR
            freq.put(prefixXOR, freq.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }
}

*/