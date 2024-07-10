import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Can't find file");
        }
    }

    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        fr.close();
    }
}
