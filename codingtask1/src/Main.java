import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




                Scanner scanner = new Scanner(System.in);


                System.out.print("Enter temperature in Celsius: ");
                double c = scanner.nextDouble();


                double f = (c * 9 / 5) + 32;


                System.out.println(c + "°C is " + f + "°F");

                scanner.close();
            }
        }

