import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader buffer = new BufferedReader(
                new FileReader("C:\\Users\\hp\\IdeaProjects\\maparray\\src\\main\\java\\reader.txt"))) {

            String line;


            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File not found or an error occurred!");
        }
    }
}
