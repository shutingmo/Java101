import java.util.Scanner;

public class TakeInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! How old are you?");
        int age = input.nextInt();


        System.out.println("you are " + age + " years old");




    }
}
