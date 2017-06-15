package pkg3nplus1problem;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Select a number to test the Collatz Conjecture:");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String nString = ""+n;
        int count = 0;
        while (true)
        {
            if (n % 2 == 0)
            {
                n = n / 2;

            } else
            {
                n = (3 * n) + 1;
            }
            count++;
            System.out.println("T" + count + " : " + n);
            
            if (n == 1)
            {
                System.out.println(nString + " reached 1 at " + count + " terms");
                scan.close();
                System.exit(0);

            }
        }
    }

}
