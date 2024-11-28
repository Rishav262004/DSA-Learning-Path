/*

Chef and Dolls

https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/MISSP

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            int[] arr = new int[N]; 

            // Reading the array
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Finding the unpaired doll
            boolean foundUnpaired = false;  
            for (int i = 0; i < N; i++) {
                int count = 0;

                for (int j = 0; j < N; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count % 2 != 0) {
                    System.out.println(arr[i]);
                    foundUnpaired = true;
                    break; 
                }
            }

            if (!foundUnpaired) {
                System.out.println("No unpaired doll found"); 
            }
        }

    }
}





 */