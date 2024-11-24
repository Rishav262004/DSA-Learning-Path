/*

Favourite Numbers

https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/FAVOURITENUM

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
          if((a%2==0 && a%7==0)|| (a%2 !=0 && a%9==0)){
              
            if(a%2==0 && a%7==0){
                System.out.println("Alice");
            }
            
            if(a%2 !=0 && a%9==0){
                System.out.println("Bob");
            }
            
            }
            else{
                System.out.println("Charlie");
            }
            
            
        }
    }
}

*/