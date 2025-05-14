import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Factorial());


    }

    public static int Factorial (int fact){
        int factorial=1;
        int fact=0;

        if (fact ==1){
            return 0;

        }
        while (fact>=0){
            factorial =fact* factorial;
            return  Factorial();

        }







    }
}