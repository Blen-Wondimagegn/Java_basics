package basics;

public class OperatorsNumbers {

    public static void main(String args[]) {
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;

        // Predicted decimal value: 4 Binary string: 100

        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = 17;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal value: 34, Binary: 100010
        System.out.println("New value: " + x);
        System.out.println("New binary: " + Integer.toBinaryString(x));
        System.out.println();


        x = 88;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        // Predicted decimal value: 176, Binary: 10110000

        System.out.println(Integer.toBinaryString(x));
        System.out.println();


//Task 2 *************************************************************


        int y = 150;
        System.out.println("binary: " + Integer.toBinaryString(y));
        y = y >> 2;
        // Predicted value 37, Binary: 100101
        System.out.println("New value after right shift: " + y);
        System.out.println("New binary after right shift: " + Integer.toBinaryString(y));
        System.out.println();

        y = 225;
        System.out.println("binary: " + Integer.toBinaryString(y));
        y = y >> 2;
        // Predicted value 56, Binary: 111000
        System.out.println("New value after right shift: " + y);
        System.out.println("New binary after right shift: " + Integer.toBinaryString(y));
        System.out.println();

        y = 1555;
        System.out.println("binary: " + Integer.toBinaryString(y));
        y = y >> 2;
        // Predicted value 388, Binary: 110000100
        System.out.println("New value after right shift: " + y);
        System.out.println("New binary after right shift: " + Integer.toBinaryString(y));
        System.out.println();

        y = 3245;
        System.out.println("binary: " + Integer.toBinaryString(y));
        y = y >> 2;
        // Predicted value after right shift 811, Binary: 1100101011
        System.out.println("New value after right shift: " + y);
        System.out.println("New binary after right shift: " + Integer.toBinaryString(y));
        System.out.println();


        // Task 3 ********************************************************************

        int a =7;
        int b = 17;
        int c = a & b;

        // Predicted 7 in binary:  0111 17 in binary: 10001 Bitwise AND:  00001 (decimal 1)
        System.out.println("Binary of a: " + Integer.toBinaryString(a));
        System.out.println("Binary of b: " + Integer.toBinaryString(b));
        System.out.println("Result of a & b: " + c);
        System.out.println("Binary of result: " + Integer.toBinaryString(c));

        // Task 4 ********************************************************************

        c = a | b;

        // Predicted result 7 in binary:  0111 17 in binary: 10001 Bitwise OR:   10111 (decimal 23)
        System.out.println("Binary of a: " + Integer.toBinaryString(a));
        System.out.println("Binary of b: " + Integer.toBinaryString(b));
        System.out.println("Result of a | b: " + c);
        System.out.println("Binary of result: " + Integer.toBinaryString(c));

        //Task 5 ***********************************************************************

        int num = 6;
        System.out.println("The number is " +num);
        num++;
        System.out.println("The increment of the number is " +num);

        //Task 6 ****************************************************


        int newNum = 10;
        System.out.println("The Number: "+newNum);
        newNum++;
        System.out.println("The first increment: "+ newNum);
        newNum+=1;
        System.out.println("The second increment: " +newNum);
        newNum = newNum + 1;
        System.out.println("The third increment: " +newNum);

    //Task 7 *******************************************************
        int d =5;
        int e = 8;

        int sum = ++d +e;
        System.out.println("The sum of ++d + e is: "+ sum);










    }

}
