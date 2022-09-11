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
        // an int occupies 32 bits (width of thirty-two)

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
        // a Byte occupies 8 bits (width of eight)

        byte minimumByteValue = Byte.MIN_VALUE;
        byte maximumByteValue = Byte.MAX_VALUE;

        System.out.println("Minimum Byte Value: " + minimumByteValue);
        System.out.println("Maximum Byte Value: " + maximumByteValue);

        System.out.println("\n----- SHORT -----");
        // a Short occupies 16 bits (width of sixteen)

        short minimumShortValue = Short.MIN_VALUE;
        short maximumShortValue = Short.MAX_VALUE;

        System.out.println("Minimum Short Value: " + minimumShortValue);
        System.out.println("Maximum Short Value: " + maximumShortValue);

        System.out.println("\n----- LONG -----");
        // a long occupies 64 bits (width of sixty-four)

        long minimumLongValue = Long.MIN_VALUE;
        long maximumLongValue = Long.MAX_VALUE;

        System.out.println("Minimum Long Value: " + minimumLongValue);
        System.out.println("Maximum Long Value: " + maximumLongValue);

        // when declaring a variable of the Long type, it's necessary to put a capital L at the end of the number
        long longValue = 123L;
        System.out.println("Long variable with value assigned: " + longValue);

        System.out.println("\n----- CHALLENGE -----");
        /*
            Create a byte variable;
            Create a short variable;
            Create an int variable;
            Create a long variable and set its value to be:
                50000 + 10 times the sum of the other three variables;
        */

        byte byteVal = (Byte.MAX_VALUE / 2);
        short shortVal = (Short.MAX_VALUE / 2) + 50;
        int intVal = (Integer.MAX_VALUE / 2) + (25 * 4);

        System.out.println("Byte value: " + byteVal);
        System.out.println("Short value: " + shortVal);
        System.out.println("Int value: " + intVal);

        long finalVal = 50000L + ( (long) (byteVal + shortVal + intVal) * 10);
        System.out.println("Final value: " + finalVal);

        // Floating point numbers, also known as real number, used when more precision is needed

        System.out.println("\n----- FLOAT -----");
        // single precision number, occupies 32 bits (width of thirty-two)
        // precision refers to the format and amount of space occupied by the type

        float minimumFloatValue = Float.MIN_VALUE;
        float maximumFloatValue = Float.MAX_VALUE;

        System.out.println("Minimum Float Value: " + minimumFloatValue);
        System.out.println("Maximum Float Value: " + maximumFloatValue);

        System.out.println("\n----- DOUBLE -----");
        // double precision number, occupies 64 bits (width of sixty-four)
        // precision refers to the format and amount of space occupied by the type

        double minimumDoubleValue = Double.MIN_VALUE;
        double maximumDoubleValue = Double.MAX_VALUE;

        System.out.println("Minimum Double Value: " + minimumDoubleValue);
        System.out.println("Maximum Double Value: " + maximumDoubleValue);

        /*
            When declaring float point numbers, by default Java will receive them as double,
            so it's necessary to explicitly tells which type is expected
        */

        // float floatVal = 5.25; <-- Java will understand this value as a double, causing an error
        // it's necessary to either add a "f" (more used) to the final or cast it to float
        float floatVal = 5.25f;
        // casting example: float floatVal2 = (float) 5.25;

        // Java already understand the value as a double,
        // but it's possible to add a "d" at the end of the value
        // double value declaration example: double doubleVal= 5.25;
        double doubleVal = 5.25d;

        System.out.println("\n----- DIVISIONS -----");
        floatVal = 5f;
        doubleVal = 5f;

        // it's important to note tha divisions with int values will not be precise
        int intValDivided = 5 / 2; // <-- expected 2.5, but got just 2;
        System.out.println("Int value divided (5 / 2): " + intValDivided);

        // so is always better to use float point numbers when dividing
        System.out.println("Float value divided (5 / 3): " + (floatVal / 3f));
        System.out.println("Double value divided (5 / 3): " + (doubleVal / 3d));

        System.out.println("\n----- CHALLENGE 2 -----");
        /*
            Convert a given number of pounds into kilograms
        */

        double kilogramsBase = 0.45329237;
        double pounds = 55;

        double poundsConverted = pounds * kilogramsBase;
        System.out.println(pounds + " pounds converted to kilograms is: " + poundsConverted);

        System.out.println("\n----- CHAR -----");
        // it stores a SINGLE character between simple quotes
        // a char occupies 16 bits (width of sixteen)
        // can store unicode characters

        char charVal = 'D';
        char unicodeVal = '\u0044';

        System.out.println("Literal value 'D': " + charVal);
        System.out.println("Unicode value '0044': " + unicodeVal);
    }
}