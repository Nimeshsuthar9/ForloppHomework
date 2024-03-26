//11.WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;

public class Count_Total_Number_Of_A
{
    public static void main(String[] args)
    {
        // create object for scanner class
        Scanner scanner =new Scanner(System.in);
        //Type The sentence
        System.out.println("Enter the sentence:-");
        String word = scanner.nextLine();

        int no = 0;
        for(int i=0 ; i<word.length(); i++)
        {
            if(word.charAt(i)=='a' || word.charAt(i)=='A')
            {
                no++;
            }
        }
        System.out.println("No of 'a' in this sentence are :- "+no );
    }
}
