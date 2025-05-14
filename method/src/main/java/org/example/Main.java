package org.example;

import java.io.*;
import java.lang.foreign.PaddingLayout;
import java.util.ArrayList;


public class Main {
    public  static void main(String[]args){

        ArrayList<Name> students = new ArrayList<>();
        students.add(new Name("Alice","UMUBYEYI",32));
        System.out.println("\n");
        students.add(new Name("Ange","UWIZERA",22));
        System.out.println("\n");
        students.add(new Name("celine ","mutesi"));

        students.add(new Name("Michou","manzi",18,32));



     try(BufferedWriter buffer =new BufferedWriter(new FileWriter("C:\\Users\\hp\\IdeaProjects\\method\\src\\main\\java\\org\\example\\name.txt"))){
         for(Name student :students){
             buffer.write(student.toString());
             buffer.newLine();

         }


     }
     catch(IOException e){
         System.out.println("no file found ");
     }


    }
}