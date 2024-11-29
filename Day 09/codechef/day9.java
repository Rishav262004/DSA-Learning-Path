/*

https://www.codechef.com/practice/course/basic-math/BASICMATH/problems/CCHOCOLATES

Chef and Chocolates

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int result=0;

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            
            int total =(x*5) + (y*10);
            
            result = total/z;
            System.out.println(result);
        }
        
    }
}
    
*/