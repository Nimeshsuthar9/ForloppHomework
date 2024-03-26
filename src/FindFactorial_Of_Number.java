//Finding factorial of a number entered by user

import java.util.Scanner;

public class FindFactorial_Of_Number
{
    public static void main(String[] args)
    {
        // call object for scanner class
        Scanner scanner=new Scanner(System.in);
        // Input the number wich you want factorial number
        System.out.println("Enter the Number:- ");
        int no=scanner.nextInt();
        int factorial=1;

        for(int i=1;i<=no;i++)
        {
            factorial =factorial *i; // formula to find factorial
        }
        System.out.println("Factorial of Number " + no + "  is :- "+factorial);
    }
}
