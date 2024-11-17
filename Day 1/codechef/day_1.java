
/*
1. Search an element in an array

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{


        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        int search = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

// ---------------------------------------------------------------------------------------------------- //

2. Find maximum in an Array

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int it=0;it<t;it++){
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
		
		int max=0;
		
		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
		max=arr[i];
		}
		}
		
		System.out.println(max);
}
	}
}


 */