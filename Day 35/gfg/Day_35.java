/*

https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1

Rotate by 90 degree

Given a square matrix mat[][] of size n x n.
The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Examples:

Input: mat[][] = [[1, 2, 3],
                [4, 5, 6]
                [7, 8, 9]]
Output: Rotated Matrix:
[3, 6, 9]
[2, 5, 8]
[1, 4, 7]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: Rotated Matrix:
[2, 4]
[1, 3]

----------------------------------------------- CODE -------------------------------------------------------------------

class Solution {

    // Function to rotate matrix anticlockwise by 90 degrees.
    
    static void rotateby90(int mat[][]) {
        int end=mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<=end;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][end];
                mat[i][end]=temp;
                end--;
            }
            end=mat.length-1;
        }
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat.length && ans<mat.length; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[ans][i];
                mat[ans][i]=temp;
                ans++;
            }
            ans=i;
            ans++;
        }
    }
}


*/