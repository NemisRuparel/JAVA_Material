import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Readinput {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            System.out.println("Enter text (Ctrl+D or Ctrl+Z to finish):");
            while ((line = br.readLine()) != null) {
                System.out.println("You typed: " + line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}