/*

https://unstop.com/code/practice/261859

In a school the class strength is represented as per following

Eg: if a[2]=20. The number of students in class 2 is 20, here 2 is the class_id.

Your task is to print X, the class_id of the first class with the number of students greater
than or equal to the number of students in adjacent previous classes and also greater
than or equal to the number of students in the adjacent class after it.

Print the value of X.

Note : - The array is sorted and 0 index-based.

Input Format
In the first line, you are given an integer, n, denoting the size of the array

In the second line, you are given n-spaced integers denoting the array.

Output Format
An integer value will be displayed representing X.

--------------------------------------------------- CODE ---------------------------------------------------------------

import java.util.*;

public class Main {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        for (int i = 0; i < n; i++) {
            boolean leftCondition = (i == 0 || arr[i] >= arr[i - 1]);
            boolean rightCondition = (i == n - 1 || arr[i] >= arr[i + 1]);

            if (leftCondition && rightCondition) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(peakIndexInMountainArray(arr));
    }
}



 */