/*

https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/HELIUM3

Chef and NextGen

---------------------------------------------- CODE ---------------------------------------------------------------------

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        // Iterate through each test case
        for (int t = 0; t < T; t++) {
            // Read input values
            int A = scanner.nextInt(); // Minimum power required per year
            int B = scanner.nextInt(); // Number of years
            int X = scanner.nextInt(); // Grams of Helium-3 on the moon
            int Y = scanner.nextInt(); // Power provided by 1 gram of Helium-3

            // Calculate total power required and total power available
            int totalPowerRequired = A * B;
            int totalPowerAvailable = X * Y;

            // Output "Yes" if the project satisfies the requirements, otherwise "No"
            if (totalPowerAvailable >= totalPowerRequired) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}


*/
