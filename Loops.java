import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {

        //-------------while loop --------------
        int x = 0;

        while(x < 10)
        {
            System.out.println(x);

            //this is very important!!
            //you must remember to change the value of x
            x++;
        }


        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number from 5 to 10, inclusive");
        int y = input.nextInt();

        int secretNum = 8;
        boolean notEqual = true;

        while(notEqual)
        {
            if (y != secretNum)
            {
                System.out.println("wrong number, please guess again");
                y=input.nextInt();
            }

            else if (y == secretNum)
            {
                System.out.println("you guessed right!");
                notEqual = false;
            }
        }

        //---------------do while--------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number between 5 and 10 inclusive");
        int guess = scan.nextInt();
        do{


            if (guess != secretNum)
            {
                System.out.println("wrong number, please guess again");
                guess = input.nextInt();
            }

            else if (guess == secretNum)
            {
                System.out.println("you guessed right!");
                notEqual = false;
            }

        }while(notEqual);

        //------------for loop----------

        for(int b = 0; b < 10; b++)
        {
            System.out.println(b);
        }



        for(int i = 0; i < 21; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }


        for(int i = 1; i <= 12; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                System.out.print(i + " x " + j + " = " + (i*j) + "  ");
            }
            System.out.println();
        }


    }
}
