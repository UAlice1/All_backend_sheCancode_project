 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // calculate the area of rectangle

        double height =0;
        double width=0;
        double area=0;

          Scanner scanner =new Scanner(System.in);
        System.out.println("enter width:");
         width = scanner.nextDouble();
        System.out.println("enter height:");
        height=scanner.nextDouble();

        area=width*height;

        System.out.println("the area of rectangle="+ area + "cm");



          scanner.close();




    }
}