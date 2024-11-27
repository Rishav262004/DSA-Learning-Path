/*

https://www.codechef.com/practice/course/binary-search/INTBINS01/problems/TRICOIN

Coins And Triangle

import java.util.Scanner;

class TriangleCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            long N = scanner.nextLong();
            System.out.println(maximumHeight(N));
        }
        scanner.close();
    }

    private static long maximumHeight(long N) {
        long low = 0, high = (long) Math.sqrt(2 * N);
        long result = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long coinsUsed = mid * (mid + 1) / 2;

            if (coinsUsed <= N) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}









*/