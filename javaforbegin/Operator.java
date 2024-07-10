package javaforbegin;

public class Operator {

    public Operator() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("a++ = " + (a++)); // Increment
        System.out.println("b-- = " + (b--)); // Decrement

        // Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c = 5;
        System.out.println("c = 5 -> c = " + c);
        c += 3;
        System.out.println("c += 3 -> c = " + c);
        c -= 2;
        System.out.println("c -= 2 -> c = " + c);
        c *= 2;
        System.out.println("c *= 2 -> c = " + c);
        c /= 2;
        System.out.println("c /= 2 -> c = " + c);
        c %= 3;
        System.out.println("c %= 3 -> c = " + c);
        c &= 3;
        System.out.println("c &= 3 -> c = " + c);
        c |= 1;
        System.out.println("c |= 1 -> c = " + c);
        c ^= 2;
        System.out.println("c ^= 2 -> c = " + c);
        c >>= 1;
        System.out.println("c >>= 1 -> c = " + c);
        c <<= 1;
        System.out.println("c <<= 1 -> c = " + c);

        // Comparison Operators
        int d = 20;
        int e = 10;
        System.out.println("\nComparison Operators:");
        System.out.println("d == e: " + (d == e));
        System.out.println("d != e: " + (d != e));
        System.out.println("d > e: " + (d > e));
        System.out.println("d < e: " + (d < e));
        System.out.println("d >= e: " + (d >= e));
        System.out.println("d <= e: " + (d <= e));

        // Logical Operators
        boolean f = true;
        boolean g = false;
        System.out.println("\nLogical Operators:");
        System.out.println("f && g: " + (f && g));
        System.out.println("f || g: " + (f || g));
        System.out.println("!(f && g): " + !(f && g));
    }
}
