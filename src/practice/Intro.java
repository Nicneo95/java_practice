// package name is always in lower caps
package practice;
// class name is always in upper caps
public class Intro {
    /*
     starting point of the programme 
     without main the programme won't run 
     */
    public static void main(String[] args) {

        // primitives data type
        /* 
        integer store whole number
        underscore can be use to format number readability
        */ 
        int number = 0;
        int number1 = 2_000_000;
        int number2 = 30;
        // double or float store decimial point number
        double pi = 3.14;
        // naming variable is always camel case
        boolean isAdult = true;
        // char store single character and must see ''
        char a = 'a';
        int result = number1 + number2;

        System.out.println("Hello World");
        System.out.println("10 + 10");
        System.out.println(number1);
        System.out.println(result);
        System.out.println(pi);
        System.out.println(isAdult);
        // arithmetic operators
        // BODMAS according to importance
        // B - Brackets
        // O - Orders (power/indices or roots)
        // D - Division
        // M - Multiplication
        // A - Addition
        // S - Subtraction
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 / number2);
        System.out.println(number1 * number2);
        System.out.println(number1 % number2);
        // increment and decrement operators: ++ -- 
        // 1 + number which is 0 and the next time you call number value is 1
        System.out.println(++number);
        System.out.println(number);
        // number is 1 + 1 the next time you call it number is 2
        System.out.println(number++);
        System.out.println(number);
        /*
        shorthand reassignement 
        number = number + 2
        number = number - 1
         */ 
        number += 2;
        number -= 1;
        number *= 1;
        System.out.println(number);
        /*
        comparison operators: < <= > >= == !=
        return true or false
        */ 
        System.out.println(10 < 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

    }
}
