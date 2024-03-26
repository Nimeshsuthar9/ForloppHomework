// 14.Write a program to calculate the sum of following series where n is input by user.
// (where n is a positive integer and input by user.) 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
import java.util.Scanner;
public class Find_Sum_Of_Series
{
    public static void main(String[] args)
    {
        // create object for scanner class
        Scanner scanner = new Scanner(System.in);
        // input number
        System.out.println("Entre the Number:-");
        int no1 = scanner.nextInt();

        int no2 = no1;
        double sum = 0;

        if(no1 > 0)
        {
            for(int i=1; i<=no1; i++)
            {
                sum = sum + ((double) 1 /no2);
                no2 = no2 - 1;
            }
            System.out.println("The sum of the series is : "+sum);
        }
        else {
            System.out.println("Entre the positive number");
        }
    }
}
