/*

https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DOMINANT2

Dominant Element

import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); 
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            // Read the array
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int maxCount = 1, currentCount = 1, dominantElement = arr[0];
            boolean isDominant = false;
            
            for (int i = 1; i < N; i++) {
                if (arr[i] == arr[i - 1]) {
                    currentCount++;
                } else {
                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        dominantElement = arr[i - 1];
                        isDominant = true;
                    } else if (currentCount == maxCount) {
                        isDominant = false;  
                    currentCount = 1; 
                }
            }
            
            if (currentCount > maxCount) {
                isDominant = true;
            } else if (currentCount == maxCount) {
                isDominant = false;
            }
            
            System.out.println(isDominant ? "YES" : "NO");
        }
    }
}






*/