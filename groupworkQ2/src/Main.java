import java.util.Scanner;

public class Main {

    public static int input(){
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("enter a Num:");
         num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("number " + num + " is even");
        }
        else {
            System.out.println("number " + num + " is odd");
        }
         return num;





    }
    public static void main(String[] args) {
        System.out.println(input());




    }

}