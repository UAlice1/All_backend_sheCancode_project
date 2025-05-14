package org.example;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.*;

public class CSVStreamProcessor {
    public static void main(String[] args) {
     String file="file.csv";
     try(Stream<String> lines = Files.lines(Paths.get(file))){

        OptionalDouble  averageAge = lines
                .skip(1)
                .map(line->line.split(","))
                .mapToInt(fields->Integer.parseInt(fields[1]))
                .filter(age-> age>=18)
                .average()
                ;

            System.out.println("Average Age:" +averageAge.orElse(0.0));



     }
     catch(IOException e){
            System.out.println("error" +e.getMessage() );

        }

     }

}