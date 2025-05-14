public class Main {
 public static void main(String[] args) {
         int secretNumber = (int) (Math.random() * 100) + 1;
         int guess = 50;
         int attempts = 0;
         int maxAttempts = 10;

         while (guess != secretNumber && attempts < maxAttempts) {
             attempts++;
            if (guess > secretNumber) {
                 System.out.println("Guess " + guess + ": Too high");
                 guess -= 10;
                 } else {
                System.out.println("Guess " + guess + ": Too low");
                 guess += 10;
                }
             }
         if (attempts < maxAttempts) {
             attempts++;
            System.out.println("Guess " + secretNumber + ": Correct!");
             System.out.println("You won in " + attempts + " attempts!");
             } else {
             System.out.println("Game Over! Secret was " + secretNumber);
             }
        }
}

