import java.io.File;
public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("myfile.txt");
        if (file.delete()) {
            System.out.println("File created successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}