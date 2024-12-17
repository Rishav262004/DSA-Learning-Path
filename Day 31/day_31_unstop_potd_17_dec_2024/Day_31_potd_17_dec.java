/*

https://unstop.com/code/practice/303273

Count the number of ways to distribute toy cars among 3 children such that 
each child should not have more than K toy cars, and the total number of distributed toy cars equals S.

--------------------------------- CODE --------------------------------------------------

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt(); 
        int S = scanner.nextInt(); 

        int count = 0; 
        
        for (int c1 = 0; c1 <= K; c1++) {
           
            for (int c2 = 0; c2 <= K; c2++) {
                
                int c3 = S - (c1 + c2);
            
                if (c3 >= 0 && c3 <= K) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}


*/