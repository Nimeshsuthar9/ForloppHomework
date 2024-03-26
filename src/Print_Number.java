//1.Print any 10 numbers between given/user input range. For eg. Print numbers between 23-33
import java.util.Scanner;

public class Print_Number
{
    public static void main(String[] args)
    {
        //create object for scanner class
        Scanner scanner = new Scanner(System.in);
        //Enter the value of  number when you want to start loop
        System.out.println("Please Enter The Starting Number Value:-");
        int no1 = scanner.nextInt();
        //Enter the value of number when you want to end loop
        System.out.println("Please Enter The Ending Number Value:-");
        int no2 = scanner.nextInt();
        //for loop conditions
        for(no1=no1;no1<=no2;no1++)
        {
            // print the value
            System.out.println(no1);
        }
    }
}
