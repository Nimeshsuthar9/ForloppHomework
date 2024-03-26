//2.Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.

import java.util.Scanner;

public class Print_Fibonaci_Series
{
    public static void main(String[] args)
    {
        // Create object for scanner class
        Scanner scanner=new Scanner(System.in);
        //Enter the value of number from you want fibonacci series;

        //Enter the value of number limit till you want fibonacci series;
        System.out.println("Enter the Limit of Fibonacci Sequence:- ");
        int limit=scanner.nextInt();
        int fT = 0, sT = 1;
        System.out.println("Fibonacci Series till " + limit + " terms:");

        for (int i = 1; i <= limit; ++i) {
            System.out.print(fT + ", ");

            // compute the next term
            int nT = fT + sT;
            fT = sT;
            sT = nT;
        }
    }
}
