/*

https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1


Sorted and Rotated Minimum

A sorted array arr[] (may contain duplicates) is rotated at some unknown point, 
the task is to find the minimum element in it.

Examples:

Input: arr[] = [5, 6, 1, 2, 3, 4]
Output: 1
Explanation: 1 is the minimum element in the array.
Input: arr[] = [3, 2, 2, 2]
Output: 2
Explanation: Here 2 is the minimum element.
Input: arr[] = [4, 4, 4]
Output: 4
Explanation: Here 4 is the only minimum element.

------------------------------------------------------ CODE ------------------------------------------------------------

class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                
                low = mid + 1;
            } else if (arr[mid] < arr[high]) {
                
                high = mid;
            } else {
                
                high--;
            }
        }

        return arr[low];
    }
}


 */