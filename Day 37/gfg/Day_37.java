/*

https://www.geeksforgeeks.org/problems/search-in-a-row-wise-sorted-matrix/1

Search in a row-wise sorted matrix

Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].

Examples :

Input: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
Output: true
Explanation: 9 is present in the matrix, so the output is true.
Input: mat[][] = [[19, 22, 27, 38, 55, 67]], x = 56
Output: false
Explanation: 56 is not present in the matrix, so the output is false.
Input: mat[][] = [[1, 2, 9],[65, 69, 75]], x = 91
Output: false
Explanation: 91 is not present in the matrix

--------------------------------------------- CODE ---------------------------------------------------------------------

class Solution {

    public boolean searchRowMatrix(int[][] mat, int x) {
        // Edge case: If matrix is empty, return false
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return false;
        }
        
        for (int[] row : mat) {
            // Perform binary search on the current row
            if (binarySearch(row, x)) {
                return true; // If found, return true
            }
        }
        
        // If not found in any row, return false
        return false;
    }
    
    private boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false; 
    }
}

*/