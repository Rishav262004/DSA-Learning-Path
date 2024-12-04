/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/ODDSUMPAIR

Odd Sum Pair
Chef has 3 numbers A,B and C
Chef wonders if it is possible to choose exactly two numbers out of the three numbers such that their sum is odd.

--------------------------------------------- code -------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int T= sc.nextInt();
		
		for(int t=0;t<T;t++){

		int i= sc.nextInt();
		int j= sc.nextInt();
		int k= sc.nextInt();
	
		if( (i+j)%2 !=0 || (j+k) %2 !=0 || (k+i) %2 !=0) {
		System.out.println("Yes");
		}else{
		System.out.println("No");
        }
		}

	}
}

 */