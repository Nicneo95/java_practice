package practice;

public class IntroFive {
    public static void main(String[] args) {
        
        String message = "   hello world" + "!!";
        // backslash escape sequence 
        String name = "Hello my name \" is john";

        // endWith return tue/false
        System.out.println(message.endsWith("!!"));
        // check the length of total character in hello world !! which is 13
        System.out.println(message.length());
        // check the index of o starts from 
        System.out.println(message.indexOf("o"));
        // replacing o
        System.out.println(message.replace("!", "?"));
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(name);
    }
}
