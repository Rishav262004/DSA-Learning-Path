/*

https://www.codechef.com/practice/course/strings/STRINGS/problems/BLOBBYVOLLEY

Blobby Volley Scores

-------------------------------------------- CODE --------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int aliceScore = 0, bobScore = 0;
            char server = 'A';
            
            for (int i = 0; i < n; i++) {
                char winner = s.charAt(i);
                if (winner == 'A') {
                    if (server == 'A') {
                        aliceScore++;
                    }
                    server = 'A';
                } else if (winner == 'B') {
                    if (server == 'B') {
                        bobScore++;
                    }
                    server = 'B';
                }
            }
            
            System.out.println(aliceScore + " " + bobScore);
        }
    }
}


 */