/*

https://www.codechef.com/practice/course/amazon-interview-questions/AMAZONPREP/problems/NEC

Your best friend has a very interesting necklace with n pearls.
On each of the pearls of the necklace there is an integer.
However, your friend wants to modify the necklace a bit and asks you for help. She wants to move the first pearl k spots
to the left (and do so with all other pearls).


import java.util.Scanner;

class NecklaceModification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int[] pearls = new int[n];
            
            for (int i = 0; i < n; i++) {
                pearls[i] = sc.nextInt();
            }

            k = k % n;
            
            int[] modifiedNecklace = new int[n];
            
            for (int i = 0; i < n; i++) {
                modifiedNecklace[i] = pearls[(i + k) % n];
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(modifiedNecklace[i] + " ");
            }
            System.out.println();
        }

    }
}

*/