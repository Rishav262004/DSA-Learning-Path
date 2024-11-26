/*
Given an integer array arr, return the mean of the remaining integers after removing the
mallest 5% and the largest 5% of the elements.

Answers within 10-5 of the actual answer will be considered accepted.

-----------------------------------------code-----------------------

import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int removeCount = n / 20;

        Arrays.sort(arr);
        
        
        double sum = 0;
        for (int i = removeCount; i < n - removeCount; i++) {
            sum += arr[i];
        }

        int remainingCount = n - 2 * removeCount;
        return sum / remainingCount;
    }
}





 */