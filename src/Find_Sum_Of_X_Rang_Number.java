//8.write a program that prints the sum of x ranging from 1 to 20.

import java.util.Scanner;

public class Find_Sum_Of_X_Rang_Number
{
    public static void main(String[] rrgs)
    {
        // Create object for scanner class
        Scanner scanner = new Scanner(System.in);
        //Enter The First Number where rang is start
        System.out.println("Enter the First Number:-");
        int no1 = scanner.nextInt();

        // Enter The Second Number where rang is finish
        System.out.println("Enter The Second Number:-");
        int no2 = scanner.nextInt();

        int sum =0;

        for(int i=no1; i<=no2; i++)
        {
            sum = sum + i; // formula to find sum
        }
        System.out.println("Sum of Rang "+ no1+" to " +no2+ " is:- "+sum);
    }
}
