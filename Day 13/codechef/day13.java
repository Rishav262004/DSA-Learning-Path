/*

https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/EQUALELE

Equal Elements

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = sc.nextInt(); // Size of the array
            int[] arr = new int[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Find the frequency of the most frequent element
            int[] freq = new int[N + 1]; // Array to store frequencies (1-based indexing)
            int maxFrequency = 0;
            
            for (int i = 0; i < N; i++) {
                freq[arr[i]]++;
                maxFrequency = Math.max(maxFrequency, freq[arr[i]]);
            }
            
            // Calculate the minimum operations
            int minOperations = N - maxFrequency;
            System.out.println(minOperations);
        }
    }
}


*/