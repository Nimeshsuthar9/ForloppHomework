//10.Java Program to Print Multiplication Table for any Number

import java.util.Scanner;

public class Make_Table
{
    public static void main(String[] args)
    {
        // create object for scanner class
        Scanner scanner=new Scanner(System.in);
        // Enter the digit which you want to make table
        System.out.println("Enter the Number:- ");
        int no1 = scanner.nextInt();

        int multipal=1;
        int no2 =1;

        for(int i=1; i<=12; i++)
        {
            multipal = no1*no2;
            System.out.println(no1 + " * " +no2 + " = " +multipal);
            no2 = no2+1;
        }
    }
}