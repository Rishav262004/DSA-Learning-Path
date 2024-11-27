/*
https://leetcode.com/problems/first-missing-positive/description/

First Missing Positive

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