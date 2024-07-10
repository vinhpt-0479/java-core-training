import java.io.IOException;

public class ThrowsExample {
    void aMethod() throws IOException{
        throw new IOException("Device error");
    }

    public static void main(String[] args) {
        try{
            ThrowsExample obj = new ThrowsExample();
            obj.aMethod();
        }catch(Exception e){
            System.out.println("Exception handled!");
        }
    }
}