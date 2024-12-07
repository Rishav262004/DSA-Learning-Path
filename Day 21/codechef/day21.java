/*

https://www.codechef.com/practice/course/number-theory/INTNT01/problems/BETDEAL

Better Deal

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

	Scanner sc = new Scanner(System.in);

	int T = sc.nextInt();

	for(int t=0;t<T;t++){

	int A = sc.nextInt();
	int B = sc.nextInt();

	int ta = 100 - ((A*100)/100);
	int tb = 200 - ((B*200)/100);

	if(ta>tb){
	System.out.println("Second");
	}else if (ta<tb) {
	System.out.println("First");
	}else{
	System.out.println("Both");
	}
	}
	}
}

 */