

public  class Atm{

    public  double balance;
    private double  balance1;
    private double  balance2;

    Atm(double balance  ){

        this.balance= balance;

    }
    public void Withdraw(double i){
        if (balance>=i){
            balance1= balance-i;
            System.out.printf( "your new balance is:" + balance1);
        }
        else if(i >balance) {
            System.out.println("there is no money to perfom this action");
        }
    }

    public void Deposit( double b ){
        if (b>=1){
            balance2=balance+b;
            System.out.println("transaction successfully , your new balance is:" + balance2);
        }
        else if(b <= 0) {
            System.out.println("there is no money to perform this task");
}
}}
//
//public class  calculus {
//    private double add;
//    private double substract;
//    private  static  double sum1;
//    private static double sub;
//
//    public static void add(double a, double b)
//    {
//        sum1 = a + b;
//        System.out.println("add is:" + sum1);
//
//    }
//
//    public static void substract(double c, double d){
//        sub = c-d;
//        System.out.println("substraction is:" + sub);
//
//}
