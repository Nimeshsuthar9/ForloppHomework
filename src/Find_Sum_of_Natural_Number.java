//6.Display Sum of n Natural Number

import java.util.Scanner;

public class Find_Sum_of_Natural_Number
{
    public static void main(String[] args)
    {
        // create object for scanner class
        Scanner scanner =new Scanner(System.in);
        //Enter the natural number which you want sum
        System.out.println("Enter The Number:- ");
        int no = scanner.nextInt();
        int sum=0;

        for(int i=1; i<=no; i++)
        {
            sum= sum + i; // formula to find the sum of number which you input by user
        }
        System.out.println("The Sum of Natural Number of "+no+" is:- " + sum );
    }
}
