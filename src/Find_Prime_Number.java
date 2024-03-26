//3.Program to check whether input number is prime or not
import java.util.Scanner;

public class Find_Prime_Number
{
    public static void main(String[] args)
    {
        // Create object for scanner class
        Scanner scanner =new Scanner(System.in);
        // Enter the number
        System.out.println("Enter the Number:- ");
        int no = scanner.nextInt();

        int no2 = 0;

        if(no>=0)
        {
            for(int i=1; i<=no; i++)
            {
                int modular = no % i;
                if(modular == 0)
                {
                    no2 =  no2 +1;
                }
            }
            if(no2>2)
            {
                System.out.println("Number is not Prime");
            }
            else
            {
                System.out.println("Number is Prime");
            }
        }
        else
        {
            System.out.println("Number is Not Prime");
        }
    }
}