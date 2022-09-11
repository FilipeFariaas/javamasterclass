public class Main {
    public static void main(String[] args) {
        System.out.println("----- CASTING -----");
        // casting converts a value from one type to another

        byte minByteValue = Byte.MIN_VALUE;

        // byte halfMinValue = (minByteValue / 2); <-- java understands this expression as an int value

        // casting
        byte halfMinValue = (byte) (minByteValue / 2); // <-- converts the expression to byte
        System.out.println(halfMinValue);
    }
}