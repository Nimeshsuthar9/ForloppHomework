//13. WAP to print month names with 1-12 – other
// invalid entry by using switch.

import java.util.Scanner;

public class Print_Month_Name
{
    public static void main(String[] args)
    {
        //Create object for scanner class
        Scanner scanner = new Scanner(System.in);
        // Enter The Number Between 1 and 12
        System.out.println("Enter The Number Between 1 to 12 : - ");
        int no=scanner.nextInt();

        // Use Switch Case
        switch (no)
        {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Enter Valid Number");
                break;
        }
    }
}