import java.sql.SQLOutput;

public class StringExamples
{
    public static void main(String[] args)
    {
        //Creating a String with literals

        String s1 = "apples";

        System.out.println("My favorite fruit is " + s1);

        //Creating a String with the "new" keyword

        String str = new String("sushi");

        System.out.println("I love to eat " + str);


        /*

        ----------String Class Methods-----------

         */

        String message = "We are learning about Strings";

        // charAt()
        System.out.println(message.charAt(0));
        System.out.println(message.charAt(3));
        System.out.println(message.charAt(4));
        System.out.println(message.charAt(9));



        // length()

        System.out.println("our message has " + message.length() + " characters");


        // concat()

        String string1 = "pine";
        String string2 = "apple";
        String string3 = string1.concat(string2);

        System.out.println(string3);


        //you can concatenate multiple strings together in one line

        String email = "alligator";

        String ufEmail = email.concat("@").concat("ufl").concat(".edu");

        System.out.println("my email address is " + ufEmail);


        //you can also work with one String object

        String intro = "Welcome";
        intro = intro.concat(" to");
        intro = intro.concat(" Java101 Session 2");
        System.out.println(intro);



        // equals()

        String str1 = new String("coffee");
        String str2 = new String("COFFEE");
        String str3 = new String("coffee");

        System.out.println("str1 is " + str1);
        System.out.println("str2 is " + str2);
        System.out.println("str3 is " + str3);

        System.out.println();
        System.out.println("str1 equals to str2: " + str1.equals(str2));
        System.out.println("str1 equals to str3: " + str1.equals(str3));
        System.out.println("str1 equals to coffee: " + str1.equals("Welcome"));
        System.out.println("str1 equals to coffee: " + str1.equals("coffee"));
        System.out.println("str1 equals to COFFEE: " + str1.equals("hello"));


        // equalsIgnoreCase()

        String fruit1 = new String("mango");
        String fruit2 = new String("MANGO");
        String fruit3 = new String("orange");

        System.out.println("fruit1 is " + fruit1);
        System.out.println("fruit2 is " + fruit2);
        System.out.println("fruit3 is " + fruit3);

        System.out.println();
        System.out.println("fruit1 equals to fruit2 " + fruit1.equalsIgnoreCase(fruit2));
        System.out.println("fruit1 equals to fruit3 " + fruit1.equalsIgnoreCase(fruit3));
        System.out.println();


        // compareTo()

        //fruit 1 = mango
        //fruit 2 = MANGO
        //fruit 3 = orange

        System.out.println(fruit1.compareTo(fruit2));
        System.out.println(fruit2.compareTo(fruit1));

        System.out.println(fruit1.compareTo(fruit1));

        System.out.println(fruit1.compareTo(fruit3));
        System.out.println(fruit3.compareTo(fruit2));


        // compareToIgnoreCase()

        System.out.println(fruit1.compareToIgnoreCase(fruit2));
        System.out.println(fruit2.compareToIgnoreCase(fruit1));

        System.out.println(fruit1.compareToIgnoreCase(fruit1));

        System.out.println(fruit1.compareToIgnoreCase(fruit3));
        System.out.println(fruit3.compareToIgnoreCase(fruit2));


        // contains()

        String x = "Adidas";
        String i = "ADiDas";
        String y = "did";
        String z = "DiD";

        //notice how it's case sensitive
        System.out.println(x.contains(y));
        System.out.println(x.contains(z));
        System.out.println(i.contains(z));


    }
}
