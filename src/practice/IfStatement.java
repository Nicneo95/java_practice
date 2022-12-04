package practice;

import java.util.Scanner;

public class IfStatement {
    
    public static void main(String[] args) {
        /*
         If temp is greater than 30. It's a hot day.
         Drink more water.
         Otherwise if between 20 to 30. It's a nice day.
         else it's a cold day.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("The temp is ");
        byte temp = input.nextByte();

        if(temp > 20 && temp < 30 ) {
            System.out.println("Is a good day");
        } else if (temp >= 30) {
            System.out.println("It's a hot day!");
            System.out.println("Drink more water");
        } else {
            System.out.println("It's a cold day.");
        }

        // ternary operators
        int income = 120_000;
        // ? - if follow by return : - else follow by return
        String className = income > 100_000 ? "High" : "Low";
        System.out.println(className);
    }
}
