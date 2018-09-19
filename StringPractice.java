import java.util.Scanner;

public class StringPractice
{
    public static void main(String[] args)
    {

        //create a winning lottery number
        String lottery = "21";


        //take in the user's guess for the lottery number
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 integers to pick your lottery numbers");
        String guess = input.nextLine();

        //save each individual number of the lottery into a char
        char lottery1 = lottery.charAt(0);
        char lottery2 = lottery.charAt(1);

        //save each individual number of the guess into a char
        char guess1 = guess.charAt(0);
        char guess2 = guess.charAt(1);


        //conditionals to see if you win any money
        if (guess.equals(lottery))
        {
            System.out.println("Yay you win $100!");
        }

        else if(lottery1 == guess2 && lottery2 == guess1)
        {
            System.out.println("You matched both numbers. You win $50");
        }

        else if(lottery1 == guess1 || lottery2 == guess2 || lottery1 == guess2 || lottery2 == guess1)
        {
            System.out.println("You matched one number. You win $25");
        }
        else
        {
            System.out.println("No number match. You win $0");
        }

    }
}
