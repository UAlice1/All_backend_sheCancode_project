package org.example;
// question number 7

////import java.util.*;
////class person {
////    private String name;
////
////}
////public person (String name){
////    this.name = name;
////}
////public  String getName(){
////    return name();
////}
////
////public class Main {
////    public static void main(String[] args) {
////        List<person> people=ArrayList(
////                new.person("Alice");
////                new.person("Michou");
////                new.person("Evodie");
////        );
////
////        people.sort((p1, p2,person p3) -> p1.getName().compareTo(p2.getName(),p2.getName().compareTo(p3.getName())));
////
////
////        for (Person p : people) {
////            System.out.println(p.getName());
////
////
////            }
////        }
// question 8
import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = List.of(5, 12, 8, 21, 3, 15);
//
//        List<Integer> filteredNumbers =
//                numbers.stream()
//                .filter(n -> n > 10)
//                .collect(Collectors.toList());
//
//        System.out.println(filteredNumbers);
//    }
//}


//question 10
//        import java.util.List;
//import java.util.stream.Collectors;
//
//
//
//public class Main {
//    public static void main(String[] args) {
//        List<String> words = List.of("Mimi", "Agasaro", "Mutoni");
//
//        List<String> uppercasedWords = words.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(uppercasedWords);
//    }
//
//question 6
public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Lambda Runnable is running!");

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
