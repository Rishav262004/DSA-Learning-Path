/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/CUTPAPER

Paper Cutting

-------------------------------------- code ------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int T = sc.nextInt();
	    
		for(int t = 0; t < T; t++){
		    
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    
		    int squaresPerSide = N / K;
		    
		    int count = squaresPerSide * squaresPerSide;
		    
		    System.out.println(count);
		}
	}
}



 */