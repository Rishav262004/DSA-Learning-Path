/*
Given an array of integers,

Your task is to find the mean of both the maximum and minimum values present in the array, round down to nearest integer.

Input Format
First line contains size of array 

Another line contains elements of array in space-separated integer.

Output Format
To find the Substrate the maximum and minimum value in array

-------------------------------------------------- code --------------------------------------------

import java.util.Scanner;

public class Main {
    public static int findMeanOfMaxMin(int size, int[] arr) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return (max + min) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int mean = findMeanOfMaxMin(size, arr);
        System.out.println(mean);
    }
}

 */