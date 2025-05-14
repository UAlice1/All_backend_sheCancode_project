package org.example;

public class CountThread3 extends Thread {
    public void run() {
        for (int a = 5; a >= 1; a--) {
            System.out.println("count dowm started ........" + a);



        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}}