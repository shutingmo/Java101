import javax.xml.bind.SchemaOutputResolver;

public class Methods
{
    public static void getGreeting()
    {
        System.out.println("Hello there!");
    }

    public static void sayName(String name)
    {
        System.out.println("Welcome " + name);
    }



    public static void passByValue(int num)
    {
        System.out.println("The number passed in is " + num);

        num = 14;

        System.out.println("The number before leaving the function is " + num);

    }

    public static int calculateSum(int num1, int num2)
    {
        int sum = num1 + num2;

        return sum;
    }

    public static int calcDifference(int num1, int num2)
    {
        int diff = num1 - num2;
        return diff;
    }

    public static void calcDiff(int num1, int num2)
    {
        System.out.println(num1-num2);
    }

    public static boolean isEven(int num1)
    {
        if (num1 % 2 == 0)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {

        //-----------------------
        //Call a method without passing in parameters, no return value

        getGreeting();

        //-------------------------
        //Call a method and pass in parameters, there is a return value
        String myName = new String("Cynthia");
        sayName(myName);

        //-------------------------
        //pass in two parameters, there is a return type

        int number1 = 3;
        int number2 = 4;

        int sumResult = calculateSum(number1, number2);

        System.out.println(number1 + " + " + number2 + " =  " + sumResult);

        //-------------------------
        //demonstrates pass by value
        int i = 10;

        System.out.println("The number before calling passByValue " + i);

        passByValue(i);

        System.out.println("The number after calling passByValue " + i);

        //------------------------
        //practice problem 1

        int a = 5;
        int b = 8;

        int dif = calcDifference(a, b);
        System.out.println("\nthis is the method with the return");
        System.out.println("The difference between " + a + " and " + b + " is " + dif + "\n");

        System.out.println("this is the method with the void");
        calcDiff(a, b);

        //------------------------
        //practice problem 2

        isEven(a);
        isEven(b);

    }
}
