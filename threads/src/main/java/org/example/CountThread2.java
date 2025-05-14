package org.example;

    public class  CountThread2 extends Thread{
        public  CountThread2(String name){
            super(name);
        }

        @Override
        public void start() {
            for (int a=1; a<=10 ;a++){
                System.out.println("the name is :" +getName() +" " +a);
            }
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

