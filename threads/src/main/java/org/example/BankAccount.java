package org.example;

public class BankAccount {

     static int balance =100000;
     public synchronized void Withdraw(int amount){
          System.out.println(Thread.currentThread().getName()+ "your balance" + balance);
     }

     public static int getBalance() {
          return balance;
     }

     public void withdraw (int amount ){
          if (balance>=amount){

               try {
                    Thread.sleep(100);

               } catch (InterruptedException e) {
                    throw new RuntimeException(e);
               }
               balance-=amount;
               System.out.println(Thread.currentThread().getName()+ "" + amount);


          }
          else {
               System.out.println(Thread.currentThread().getName() + "Withdraw fail you don't have enough money");

          }


     }

}
