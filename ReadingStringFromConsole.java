package basics;


import java.util.Scanner;

public class ReadingStringFromConsole {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter three words separated by spaces: ");
//        String s1 = input.next();
//        String s2 = input.next();
//        String s3 = input.next();
//        System.out.println("s1 is " + s1);
//        System.out.println("s2 is " + s2);
//        System.out.println("s3 is " + s3);
//
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        String s = in.nextLine();
//        char ch = s.charAt(0);
//        System.out.println("The character entered is "+ ch);
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */;
        System.out.println( A.substring(0, A.length()-1));

    }
}

