/*

Write a program to find the remainder when an integer A is divided by an integer B.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	int a,b;

	for(int t=0;t<n;t++){

	a=sc.nextInt();
	b= sc.nextInt();

	System.out.println(a%b);
	}
	}
}

-------------------------------------------------------------------------------------------------------------------------

Chef has started working at the candy store. The store has
100
100 chocolates in total.

Chef's daily goal is to sell

X chocolates. For each chocolate sold, he will get 1 rupee. However, if Chef exceeds his daily goal,
he gets 2 rupees per chocolate for each extra chocolate.

If Chef sells Y chocolates in a day, find the total amount he made

-------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int C = sc.nextInt();

        int[] apples = new int[N];
        for (int i = 0; i < N; i++) {
            apples[i] = sc.nextInt();
        }

        long steps = 0;
        int currentLoad = 0;

        for (int i = 0; i < N; i++) {
            if (currentLoad + apples[i] > C) {
                
                steps += 2 * i;
                currentLoad = 0;
            }

            currentLoad += apples[i];
        }

        steps += N;
        System.out.println(steps);
    }
}

-------------------------------------------------------------------------------------------------------------

Scalene Triangle

Given
A,B, and C as the sides of a triangle, find whether the triangle is scalene.

Note:

A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if(a==b || a==c || b==c){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}



*/