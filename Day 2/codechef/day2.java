/*
1. Largest and Second Largest
You are given an array of integers.
Find the maximum sum of two distinct integers in the array.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int max =0;
            int max2 =0;
    
            for(int i =0;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
            
            for(int i =0;i<n;i++){
                if(a[i]>max2 && a[i]<max){
                    max2=a[i];
                }
            }
            
            System.out.println(max+max2);
            
        }
    }
}

#----------------------------------------------------------------------------------------------------------------#

2. Running Comparison

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            
            boolean found = false;
            int c=0;
            
            for(int i =0;i<n;i++){
                if((b[i] > 2*(a[i])) || (a[i] > 2*(b[i]))){
                    found = true;
                }
                else{
                    c++;
                }
            }
            System.out.println(c);
            
        }
    }
}

# ---------------------------------------------------------------------------------------------------------------- #

3. Cost of Groceries

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            
            int cost=0;
            
            for(int i=0;i<n;i++){
                if(a[i]>=x){
                    cost+=b[i];
                }
                
            }
            System.out.println(cost);
        }
    }
}

 */