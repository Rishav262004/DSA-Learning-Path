/*

https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1

Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. 
Return -1 if the key is not found.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
Output: 8
Explanation: 3 is found at index 8.
Input: arr[] = [3, 5, 1, 2], key = 6
Output: -1
Explanation: There is no element that has value 6.
Input: arr[] = [33, 42, 72, 99], key = 42
Output: 1
Explanation: 42 is found at index 1.

----------------------------------------------- CODE------------------------------------------------------

class Solution {
    int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1; 
                } else {
                    low = mid + 1; 
            } else { d
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1; 
                } else {
                    high = mid - 1; 
                }
            }
        }

        return -1;
    }

    
*/