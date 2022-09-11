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

        System.out.println("\n----- INT -----");

        int minimumIntValue = Integer.MIN_VALUE;
        int maximumIntValue = Integer.MAX_VALUE;

        System.out.println("Minimum Integer Value: " + minimumIntValue);
        System.out.println("Maximum Integer Value: " + maximumIntValue);
        System.out.println("Underflow Integer Value: (minimum value - 1): " + (minimumIntValue - 1));
        System.out.println("Overflow Integer Value: (maximum value + 1): " + (maximumIntValue + 1));

        // int values can be separated by "_"
        int separatedIntValue = 2_123_456;
        System.out.println("Integer Value Separated by '_' (2_123_456) number: " + separatedIntValue);

        System.out.println("\n----- BYTE -----");

        byte minimumByteValue = Byte.MIN_VALUE;
        byte maximumByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value: " + minimumByteValue);
        System.out.println("Maximum Byte Value: " + maximumByteValue);

        System.out.println("\n----- SHORT -----");

        short minimumShortValue = Short.MIN_VALUE;
        short maximumShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value: " + minimumShortValue);
        System.out.println("Maximum Short Value: " + maximumShortValue);

        System.out.println("\n----- LONG -----");

        long minimumLongValue = Long.MIN_VALUE;
        long maximumLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value: " + minimumLongValue);
        System.out.println("Maximum Long Value: " + maximumLongValue);
    }
}