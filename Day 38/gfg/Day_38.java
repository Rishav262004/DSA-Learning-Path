/*

https://www.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1

Search in a sorted Matrix
Difficulty: MediumAccuracy: 56.27%Submissions: 111K+Points: 4
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. 
Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, 
and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

Examples:

Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.
Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
Output: false
Explanation: 42 is not present in the matrix.
Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.

------------------------------------------------------------- CODE -----------------------------------------------------

class Solution {
    
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        
        int row = 0;
        int col = m - 1;
        
        while (row < n && col >= 0) {
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] > x) {
                col--;
            } else {
                row++;
            }
        }
        
        return false;
    }
}

*/