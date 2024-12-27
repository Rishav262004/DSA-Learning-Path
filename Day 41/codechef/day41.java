/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CREDCOINS

CRED Coins

----------------------------------------- CODE -------------------------------------------------------------------------


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Read input
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Number of test cases

		while (T-- > 0) {
			int X = sc.nextInt(); // CRED coins per bill
			int Y = sc.nextInt(); // Number of bills

			// Calculate total CRED coins and number of bags
			int totalCoins = X * Y;
			int bags = totalCoins / 100;

			// Output the result
			System.out.println(bags);
		}

	}
}

*/