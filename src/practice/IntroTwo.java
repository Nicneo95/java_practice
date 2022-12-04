package practice;

import java.util.Arrays;

public class IntroTwo {

    public static void main(String[] args) {
        // strings
        String amigos = "amigos";
        String code = "code";
        String brand = amigos + code;

        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(6));
        // arrays
        /*
        1. specify what kind of data type int, string etc...
        2. [] - eg. int[] integer of array
        3. name the array
        4. new int[] - specify how many integer the array can hold
        ONCE DEFINE SIZE CANNOT CHANGE THE ARRAY SIZE
         */
        int[] numbers = new int[3];
        // index 0 store 1 
        numbers[0] = 1;
        // index 1 store 33
        numbers[1] = 33;
        numbers[2] = 6;
        // shorter way of writing 
        double[] numbers2 = {0, 5, 6, 8, 9};
        String[] name = {"John", "Alice", "Bala"};
        int[] numbers3 = new int[4];
        /*
         primitive default value is always 0 
         */
        Arrays.fill(numbers3, -1);
        numbers3[1] = 12;
        /*
         string default value is null
         */
        String[] names = new String[3];
        names[1] = "John";

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(numbers3));
        System.out.println(Arrays.toString(names));

    }
}
