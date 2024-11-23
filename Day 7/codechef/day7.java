/*

https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/FLOW006

Sum of Digits
You're given an integer N. Write a program to calculate the sum of all the digits of N.

Input Format
The first line contains an integer T, the total number of testcases.
Then follow T lines, each line contains an integer N.

Output Format
For each test case, calculate the sum of digits of N, and display it in a new line.

---------------------------------------------- code --------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
		
		for(int i=0;i<T;i++){

		int N = sc.nextInt();
		int sum=0;

		while(N>0){
		int rem = N%10;
		sum+=rem;
		N/=10;
	}

		System.out.println(sum);
		}
	}
}


*/