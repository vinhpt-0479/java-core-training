package exceptions;
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Gây ra NullPointerException
        } 
        // because the Exception class is the superclass of exceptions and when declared like that, the exceptions will be caught by the exception parent class before going to the child class
        // catch(Exception e){
        //     System.out.println("Exception class catch");
        // } 
        catch (NullPointerException e) {
            System.out.println("Exception occurred: " + e);
            e.printStackTrace();
        } finally {
            System.out.println("The finally block is executed.");
        }
    }
}
