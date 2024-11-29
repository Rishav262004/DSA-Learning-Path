/*

https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1

You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1. The array can have negative integers too.

Examples:

Input: arr[] = [2, -3, 4, 1, 1, 7]
Output: 3
Explanation: Smallest positive missing number is 3.
Input: arr[] = [5, 3, 2, 5, 1]
Output: 4
Explanation: Smallest positive missing number is 4.
Input: arr[] = [-8, 0, -1, -4, -3]
Output: 1
Explanation: Smallest positive missing number is 1.


------------------------------------------------- code --------------------------------------------------

class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {

                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Step 2: Identify the first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // Missing positive number
            }
        }

        // If all positions are filled correctly, the missing number is n+1
        return n + 1;
    }
}

*/