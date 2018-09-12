public class Operators
{
    public static void main(String args[])
    {

        // --------Arithmetic Operators--------------

        int num1 = 100;
        int num2 = 20;

        System.out.println("num1 + num2: " + (num1 + num2) );
        System.out.println("num1 - num2: " + (num1 - num2) );
        System.out.println("num1 * num2: " + (num1 * num2) );
        System.out.println("num1 / num2: " + (num1 / num2) );
        System.out.println("num1 % num2: " + (num1 % num2) );

        int x = 5;
        int y = 4;
        System.out.println("x % y: " + (x % y) );

        // Increment

        x++;
        System.out.println(x);

        y--;
        System.out.println(y);


        // Pre Increment vs Post Increment

        int a = 5;
        int b = 3;
        int e = 6;

        /*
           c is set to 15
           because the this is post increment
           the expression (a * b) is evaluated first (5 * 3) = 15
           then b is incremented
           after this operation b is 4
         */
        int c = a * b++;
        System.out.println(b);

        /*
            d si set to 35
            this is pre increment
            the increment is applied first, so e is incremented from 6 to 7
            then the expression (a * e) is evaluated, so (5 * 7) = 35
         */
        int d = a * ++e;


        //another example
        int k = 10;
        System.out.println(k++);// prints 10 first, then increments k to 11

        System.out.println(++k);// increments k from 11 to 12 first, then prints k which is 12

        System.out.println(k--);// prints current value of k (which is 12), then decrements k to 11

        System.out.println(--k);// decrements k from 11 to 10 first, then prints k which is 10



        //-----------Logical Operators-----------

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("!(b1 && b2): " + !(b1 && b2));


        //----------Relational Operators----------

        int r = 10;
        int t = 20;

        System.out.println("a == b is "  + (r == t) );
        System.out.println("a != b is "  + (r != t) );
        System.out.println("a > b is "   + (r > t) );
        System.out.println("a < b is "   + (r < t) );
        System.out.println("b >= a is "  + (t >= r) );
        System.out.println("b <= a is "  + (t <= r) );


        //-----------Assignment Operators----------

        int A = 10;
        int B = 20;
        int C = 0;

        C = A + B;
        System.out.println("c = a + b is " + C ); //30

        C += A ;
        System.out.println("c += a  is " + C ); //40

        C -= A ;
        System.out.println("c -= a is " + C ); //30

        C *= A ;
        System.out.println("c *= a is " + C ); //300

        A = 10;
        C = 15;
        C /= A ;
        System.out.println("c /= a is " + C ); //1

        A = 10;
        C = 15;
        C %= A ;
        System.out.println("c %= a is " + C); //5
    }
}
