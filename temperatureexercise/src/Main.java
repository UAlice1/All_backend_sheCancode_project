import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();

        if (temperature <= 0) {
            System.out.println("Freezing");
        }
        else if (temperature > 0 && temperature <= 20) {
            System.out.println("Cold");
        }
        else {
            System.out.println("Hot");
        }

        scanner.close();
    }
}
