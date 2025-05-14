package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class Exceptional {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("welcome to our website");
        Thread.sleep(3000);
        System.out.println("how can i help you");
        int age = 10;
//        if(age < 10){
//            throw new ageException("you are under age ");
//        }
//        try{
//            FileReader file = new FileReader("Main.java");
//            BufferedReader read = new BufferedReader(file);
//            read.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        int[] numbers;

        numbers = new int[]{2, 0, 45};

        Arrays.sort(numbers, (a,b) -> b - a);
        System.out.println(Arrays.toString(numbers));
    }
}
