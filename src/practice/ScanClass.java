package practice;

import java.util.Scanner;

public class ScanClass {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age = scanner.nextByte();
        // System.out.println("You are " + age + " years old");

        System.out.print("Name:");
        // next() only return John Goh if you want a full sentenece use nectLine() instead
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " welcome come back!");
    }
}
