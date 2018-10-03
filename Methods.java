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
    
    public static void main(String[] args)
    {

        sum = 13;
        //-----------------------
        //Call a method without passing in parameters, no return value

        getGreeting();

        //-------------------------
        //Call a method and pass in parameters, there is a return value
        String myName = new String("Cynthia");
        sayName(myName);

        //-------------------------

        int number1 = 3;
        int number2 = 4;

        int sumResult = calculateSum(number1, number2);

        System.out.println(number1 + " + " + number2 + " =  " + sumResult);

        //-------------------------

        int i = 10;

        System.out.println("The number before calling passByValue " + i);

        passByValue(i);

        System.out.println("The number after calling passByValue " + i);

        //------------------------


    }
}
