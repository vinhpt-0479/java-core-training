public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // Gây ra ArithmeticException nếu b là 0
    }
}
