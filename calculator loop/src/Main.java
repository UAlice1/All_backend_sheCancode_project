import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
        int number;
        System.out.println("enter a number :");
        number = scanner.nextInt();
        int product;

       for( int i = 0; i <= 12; i++){

           product = number * i ;
           System.out.printf("%d * %d = %d \n",number , i , product );



        }
    }
}