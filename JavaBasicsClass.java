package basics;

public class JavaBasicsClass {



    public static void main(String[] args) {

        /*Write a program that declares two integer variables, assigns an integer to each,
        and adds them together. Assign the sum to a variable. Print out the result.
         */
        int num1 = 3;
        int num2 = 4;
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is : " + sum);

        /*Write a program that declares two double variables, assigns a number to each,
        and adds them together. Assign the sum to a variable. Print out the result.
         */

        double num3 = 2.0;
        double num4 = 3.0;
        double doubleSum = num3 + num4 ;
        System.out.println("The sum of two numbers is : " + doubleSum);

        /*Write a program that declares an integer variable and a double variable,
        assigns numbers to each, and adds them together. Assign the sum to a variable.
        Print out the result. What variable type must the sum be?
         */

       // The sum variable must be double when doing the addition we can not store double value to int

        int intNum = 2;
        double doubleNum = 4.0;
        double twoSum = intNum + doubleNum;
        System.out.println("The sum of two numbers is : " + twoSum);

        /*Write a program that declares two integer variables, assigns an integer to each,
         and divides the larger number by the smaller number. Assign the result to a variable. Print out the result.
         Now change the larger number to a decimal. What happens? What corrections are needed?*/

        int number1 = 6;
        int number2 = 3;

        int div = number1 / number2;
        System.out.println("The quotient of two numbers is : " + div);

        //What happens? the output is going to be zero which is not correct.
       //What corrections are needed? The data type for the results of two integers must be converted to double

        double division = (double) number2 / number1;
        System.out.println("The quotient of two numbers is : " + division);

        /*Write a program that declares two double variables, assigns a number to each,
        and divides the larger by the smaller number. Assign the result to a variable.
        Print out the result. Now, cast the result to an integer. Print out the result again.
         */

        double smallNum = 10;
        double largeNum = 100;

        double divNum = largeNum / smallNum;
        System.out.println("The quotient of two numbers is : " + divNum);

        int divNum1 = (int) divNum;
        System.out.println("The casted result is : " + divNum1);

        /*Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        Declare a variable q and assign y/x to it and print q.
        Now, cast y to a double and assign it to q. Print q again.*/

        int x =5;
        int y = 6;
        int q = y/x;
        System.out.println(q);
        double qDouble = (double)y;
        System.out.println(qDouble);

        /*Write a program that declares a named constant and uses it in a calculation.
        Print the result.*/

        final double PI =3.1415;
        double circumference = 9.3;
        double diameter = PI/circumference;
        System.out.println("The diameter of the circle is "+ diameter);

        /*Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and totalSale and
        complete an “order” for three items of the first product, four items of the second product,
        and two items of the third product. Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places.
         */

        double coffee = 5.70;
        double cappuccino = 4.50;
        double espresso = 5.50;
        double subtotal = 0.0;
        double totalSale = 0;
        final double SALES_TAX = 2.4;

        double firstOrder = coffee * 3;
        double secondOrder = cappuccino * 4;
        double thirdOrder = espresso * 2;
        subtotal = firstOrder + secondOrder+thirdOrder;
        totalSale = subtotal + SALES_TAX ;
        System.out.printf("Total Sale: %.2f%n", totalSale);

    }
}



