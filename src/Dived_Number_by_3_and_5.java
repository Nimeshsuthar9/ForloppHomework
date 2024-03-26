//9.WAP to print the numbers between 1 and 100 which can be divided by 3 and 5 separately

public class Dived_Number_by_3_and_5
{
    public static void main(String[] args)
    {
        System.out.println("Number which is divided by 3 is:-");

        for(int i=1; i<=100; i++)
        {
            if(i%3==0) // condition for find divided number by 3
            {
                System.out.print(i +" ");
            }
        }
        System.out.println("Number which is divided by 5 is :-");

        for(int i=1;i<=100;i++)
        {
            if(i%5==0) // condition for find divided number by 5
            {
                System.out.print(i +" ");
            }
        }
    }
}
