//4.Reverse a number using for Loop

import java.util.Scanner;

public class Print_Reverse_Number
{
    public static void main(String[] args)
    {
        // call object for scanner class
        Scanner scanner = new Scanner(System.in);
        // Input the number which you want to reverse
        System.out.println("Enter The number:-");
        int no = scanner.nextInt();
        int rev=0;

        for(int i=1;i<=no;i++)
        {
            //formula to reverse the number
            rev=rev*10+(no%10);
            no=no/10;
        }
        System.out.println("The Revers Number is :- " +rev);
    }
}
