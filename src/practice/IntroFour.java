package practice;

public class IntroFour {
    /*
     - Access Modifier (Private, Public, Protected & Default )
     - Static Optional (belonging to a class)
     - Return type (void if no return, int, string etc...)
     - Name 
     - Optional Parameters (Parameters are inside () for this case array of string )
     - Method Body (anthing inside {} )
     - Optional return value (since void no return value)
     */

     private static int addNumber(int num1, int num2) {
        int result = num1 + num2;
        return result; 
     }

     public static void main(String[] args) {

        int result = addNumber(1,2);
        System.out.println(result); 
     }
}
