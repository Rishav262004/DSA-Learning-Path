/*

https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/SNDMAX?tab=statement

Second Max of Three Numbers

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int tl = sc.nextInt();

        for (int t = 0; t < tl; t++) {
            
            int arr[] = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            int max =0;
            int secondMax = 0;
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
                
            for(int j =0 ; j<arr.length;j++){
                if(arr[j] > secondMax && arr[j] < max) {
                    secondMax = arr[j];
            }
            }
                System.out.println(secondMax);
        }
    }
}


*/