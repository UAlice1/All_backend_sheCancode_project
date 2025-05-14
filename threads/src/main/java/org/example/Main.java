package org.example;

public class Main {
    public static void main(String[] args) {
//       CountThread thread1= new CountThread("Alice");
//       thread1.start();
//       CountThread2 thread2 =new CountThread2("ANGE");
//       thread2.start();
//       try{
//           thread2.join();
//           thread1.join();
//
//       } catch (InterruptedException e) {
//           throw new RuntimeException(e);
//       }

//
//CountThread3 thread3= new CountThread3();
//thread3.start();
        //START Runnable
//        myRunnable myRunnable = new myRunnable();
//       Thread thread=new Thread(myRunnable);
//       thread.start();
BankAccount sharedBank = new BankAccount();
WithdrawTask task1=new WithdrawTask(sharedBank);
WithdrawTask task2=new WithdrawTask(sharedBank);

Thread t1=new Thread(task1,"firstuser");
Thread t2=new Thread(task2,"second2 ");
t1.start();
t2.start();


    }}
