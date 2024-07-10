package exceptions;
public class ErrorExample {
    public static void main(String[] args) {
        try {
            causeError();
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow occurred.");
        }
    }

    public static void causeError() {
        causeError(); // Gọi đệ quy vô hạn gây ra lỗi tràn bộ nhớ
    }
}
