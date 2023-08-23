import java.io.FileWriter;
import java.io.File;
public class FileHandling {
    public static void main(String[] args) {
        try {
            File f = new File("src/example.txt");
            FileWriter w = new FileWriter(f);
            w.write("This is written to the file\n");
            w.write("555\n");
            w.write(555);
            w.close();
        }
        catch (Exception E){
            System.out.println(E.getMessage());
        }
    }
}