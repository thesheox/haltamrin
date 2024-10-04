package course_1.expressions;

public class TypeConversion {
    public static void main(String[] args) {
        int num = 10;
        double decimal = num; // Implicit conversion

        double largeDecimal = 12.56;
        int truncatedNum = (int) largeDecimal; // Explicit conversion

        System.out.println("Implicit Conversion: " + decimal);
        System.out.println("Explicit Conversion: " + truncatedNum);
    }
}
