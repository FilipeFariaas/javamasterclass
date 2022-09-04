package udemy.javamasterclass;

public class Main {
    public static void main(String[] args) {
        /*
        There are 8 primitive types:
            - boolean
            - byte
            - char
            - short
            - int
            - long
            - float
        */

        /* Integer is a Wrapper Class
           Java has Wrapper Classes for all eight primitive types
        */
        int minimumIntValue = Integer.MIN_VALUE;
        int maximumIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value: " + minimumIntValue);
        System.out.println("Maximum Integer Value: " + maximumIntValue);
    }
}