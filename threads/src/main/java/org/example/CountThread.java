package org.example;

   public class CountThread extends Thread {
       public  CountThread(String name){
           super(name);
       }

       @Override
       public void start() {
           for (int b=1; b<=10;b++){
               System.out.println(getName()+ "" +b);
           }
           try{
               Thread.sleep(200);

           }
           catch (InterruptedException e)
           {
               throw new RuntimeException(e);
           }

       }
   }
