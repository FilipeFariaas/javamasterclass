public class Main {
    public static void main(String[] args) {
        System.out.println("----- STRING -----");
        // stores a full sequence of chars between double quotes (a text)
        // not a primitive type, but a class

        String stringVal = "This is a string";
        System.out.println(stringVal);

        // a String can be combined with another strings
        stringVal += ". \u00A9 2022";
        System.out.println(stringVal);

        // Java will automatically convert any value combined to a String into a String
        String numberString = "10";
        int numberInt = 10;

        System.out.println(numberString + numberInt);
    }
}