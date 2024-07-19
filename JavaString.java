package basics;

import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        //isEmpty()
        String s1="";
        String s2="hello";
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());

        //trim()
        String st1="  hello   ";
        System.out.println(st1+"how are you");        // without trim()
        System.out.println(st1.trim()+" how are you"); // with trim()


        //toLowerCase()
        String s3="HELLO HOW Are You?";
        String s1lower=s3.toLowerCase();
        System.out.println(s1lower);

        //toUpper()
        String s4="hello how are you";
        String s1upper=s4.toUpperCase();
        System.out.println(s1upper);

        //concat()
        String str3 = "Learn ";
        String str4 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str3)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(str4.concat(str3)); // "JavaLearn "
        //--- By using + operator---
        String st3 =  "hello";
        String st4 = "Learners";

        //  String s5 = s3.concat(s4); or
        String s5 = st3 + st4;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
        String strg = "Supplement" + 'B'; // s1 becomes Supplement B

        //split()
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        String msg = "Welcome to Java";
        System.out.println("The first character in the message is " + msg.charAt(0));
    }

}
