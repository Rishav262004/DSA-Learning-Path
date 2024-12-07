/*

https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

Count Inversions

Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.


---------------------------------------------------------- Code --------------------------------------------------------

class Solution {
    
    static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; 
        int j = mid + 1; 
        int k = left; 
        int invCount = 0;

       
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid + 1) - i; 
            }
        }
        
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            
            invCount += mergeSortAndCount(arr, temp, left, mid);
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);


            invCount += mergeAndCount(arr, temp, left, mid, right);
        }

        return invCount;
    }

    static int inversionCount(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }
}

-------------------------------------------------------------- Brute force method --------------------------------------


class Solution {
    static int inversionCount(int arr[]) {
        
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
        for(int j=1;j<arr.length;j++){
    if(arr[i]>arr[j] && i<j){
            count++;
}
    }
        }
        return count;
    }
}


*/