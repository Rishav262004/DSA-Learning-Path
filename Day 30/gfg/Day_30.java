/*

https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1

Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Examples :

Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.
Input: a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
Output: 256
Explanation: Combined sorted array is [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]. The 7th element of this array is 256.

-------------------------------------------- CODE ---------------------------------------------------------

class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n = a.length;
        int m = b.length;

        if (n > m) {
            return kthElement(b, a, k);
        }

        int low = Math.max(0, k - m);
        int high = Math.min(k, n);

        while (low <= high) {
            int i = (low + high) / 2; 
            int j = k - i;            

            int A_left = (i == 0) ? Integer.MIN_VALUE : a[i-1];
            int A_right = (i == n) ? Integer.MAX_VALUE : a[i];

            int B_left = (j == 0) ? Integer.MIN_VALUE : b[j-1];
            int B_right = (j == m) ? Integer.MAX_VALUE : b[j];

            if (A_left <= B_right && B_left <= A_right) {
                
                return Math.max(A_left, B_left);
            } else if (A_left > B_right) {
                high = i - 1;
            } else {
              
                low = i + 1;
            }
        }

        throw new IllegalArgumentException("No valid k-th element found.");
    }
}


*/