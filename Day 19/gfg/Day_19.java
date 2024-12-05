/*

https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

Sort 0s, 1s and 2s

Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

------------------------------------------------ Code ---------------------------------------------------

// Dutch National Flag Algorithm

class Solution {

    public void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;
        int temp;

        while (mid <= high) {
            if (arr[mid] == 0) {
                
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}

 */