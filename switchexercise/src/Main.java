import java.util.Scanner;

public class Main {
    public static void main(String[] args){

         Scanner Scanner = new Scanner(System.in);
        System.out.println("enter day");
        int day =Scanner.nextInt();
          switch (day){
              case 1:
                  System.out.println("monday");
                  break;
              case 2:
                  System.out.println("tuesday");
                  break;
              case 3:
                  System.out.println("thursday");
                  break;
              default:
                  System.out.println("this is not day of the week");
          }

    Scanner.close();
}  }