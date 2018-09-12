import java.util.Scanner;

public class Conditionals
{
    public static void main(String[] args)
    {
        // if statement

        int num = 70;
        if (num < 100) {
            /* This println statement will only execute,
             * if the above condition is true
             */
            System.out.println("number is less than 100");
        }


        // Nested if statement

        int numb = 70;
        if (numb < 100) {
            System.out.println("number is less than 100");

            if (numb > 50) {
                System.out.println("We're inside the nested for loop");
                System.out.println("number is greater than 50");
            }
        }


        // if else statement

        int x = 120;
        if (x < 50) {
            System.out.println("x is less than 50");
        } else {
            System.out.println("x is greater than or equal 50");
        }


        // if else-if statement

        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }


        // switch statement

        Scanner input = new Scanner(System.in);

        System.out.print("What day of the week is it (1-7):");

        int day = input.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");
        }

    }
}

