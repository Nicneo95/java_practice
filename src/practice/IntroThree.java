package practice;

import java.util.Arrays;

public class IntroThree {
    public static void main(String[] args) {
        
        String[] name = {
            "James", // index 0
            "Naida", // index 1
            "Sophia",
            "Alex",
            "John",
            "Aisha"
        };
        // looping through an array
        for (int i = 0; i < name.length; i++) {
            
            System.out.println(name[i]);
        }

        if(true) {
            System.out.println("the code will run");
        }

        System.out.println(Arrays.toString(name));
    }
}
