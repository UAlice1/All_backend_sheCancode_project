import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble(); // Use double for accuracy

        // Convert to Fahrenheit
        double f = (c * 9 / 5) + 32;

        // Print the result
        System.out.println(c + "°C is " + f + "°F");

        scanner.close();
    }
}
