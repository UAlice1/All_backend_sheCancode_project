import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random random = new Random ();
        Scanner scanner =new Scanner (System.in);

         int guess ;
         int attempts=0;
         int min=1;
         int max=5;
         int randomNumber=random.nextInt(min,max );
        System.out.println("Number guessing game");
        System.out.println("Guess a number between 1 and 5");



        do{
            System.out.println("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;
            scanner.nextLine();

            if(guess ==0 ){
                System.out.println("please enter something ");
            }
             else if(guess<randomNumber ){

                System.out.println("Too low! Try again");
            }
            else if (guess>randomNumber) {
                System.out.println("Too high");

            }
            else {
                System.out.println("CORRECT The number was" +randomNumber);
                System.out.println("number of attempts:" +attempts);
                System.out.println("you won the game ");
            }

        }
            while (guess !=randomNumber);








    }
}