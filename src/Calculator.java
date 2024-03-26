//7. Making Calculator using the switch statement
// (The program takes three inputs from the user: one operator and 2 numbers.
// Based on the operator provided by the user, it performs the calculation on
// the numbers. Then the result is displayed on the screen.)

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        //create object for scanner class
        Scanner scanner =new Scanner(System.in);
        //Enter Numbers
        System.out.println("Enter The value of Number 1:-");
        int no1 = scanner.nextInt();

        System.out.println("Enter The Value Of Number 2:-");
        int no2 = scanner.nextInt();

        System.out.println("Enter the Symbol from '+', '-', '*', '/' :- ");
        char  sign = scanner.next().charAt(0);

        long total;

        // use switch case

        switch(sign)
        {
            case '+':
                System.out.println("You Select Addition '+' ");
                total = no1 + no2;
                System.out.println("Addition of value "+no1+" And "+no2+ " is :- "+total);
                break;
            case '-':
                System.out.println("You Select Subtraction '-' ");
                total = no1 - no2;
                System.out.println("Subtraction of value "+no1+" And "+no2+ " is :- "+total);
                break;
            case '*':
                System.out.println("You Select Multiplication '*' ");
                total = no1 * no2;
                System.out.println("Multiplication of value "+no1+" And "+no2+ " is :- "+total);
                break;
            case '/':
                System.out.println("You Select Division '/' ");
                total = no1 / no2;
                System.out.println("Division of value "+no1+" And "+no2+ " is :- "+total);
                break;
            default:
                System.out.println("Please enter Symbol from '+' , '-' , '*' And '/' ");
                break;
        }
    }
}