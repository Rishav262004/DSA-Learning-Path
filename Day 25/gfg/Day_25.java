/*

https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

Merge Without Extra Space

Given two sorted arrays a[] and b[] in non-decreasing order. 
Merge them in sorted order without using any extra space. 
Modify a so that it contains the first n elements and modify b so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10
Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output:
1 2 3 5 8 9
10 13 15 20
Explanation: After merging two sorted arrays we get 5 10 12 18 20.
Input: a[] = [0, 1], b[] = [2, 3]
Output:
0 1
2 3
Explanation: After merging two sorted arrays we get 0 1 2 3.

---------------------------------------------------------- CODE --------------------------------------------------------

class Solution {
    
    public void mergeArrays(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        
        
        for (int i = n - 1, j = 0; i >= 0 && j < m; i--, j++) {
            
            if (a[i] > b[j]) {
                // Swap the elements.
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
        }
        
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

 */