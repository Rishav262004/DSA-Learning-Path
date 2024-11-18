/*
 * Given an unsorted array arr[]. 
 * Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. 
 * Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.

// -----------------------------------------------------------------------------------------

class Solution {
    public void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Handle cases where d > n
        if (d == 0) return; // No rotation needed

        // Reverse the first part of the array
        reverse(arr, 0, d - 1);

        // Reverse the second part of the array
        reverse(arr, d, n - 1);

        // Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();

        Solution solution = new Solution();
        solution.rotateArr(arr, d);

        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

 */