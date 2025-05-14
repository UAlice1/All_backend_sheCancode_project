import  java.util.ArrayList;
public class Main  {
    public static void main(String[]args){

        ArrayList<String> toys = new ArrayList();

        toys.add("pookie");
        toys.add("angel");
        toys.add("Amaya");
        toys.add("Alice");
//        for(int i=0 ; i<toys.size();i++) {
//            System.out.println(toys.get(i));
//        }
        for( String toy:toys){
            System.out.println(toy);
        }
        if (toys.contains("AKA")){
            System.out.println("aka is in toy bos");
        }
        else {
            System.out.println( " Aka not in toy box ");
        }

        int index= toys.indexOf("pookie");
        System.out.println("the pookie  position is: " + index);
         toys. remove(2);
        System.out.println( "\n after remove item ");
        for (int i=0 ; i <toys.size(); i ++){
            System.out.println("index: " + toys.get(i));
        }

    }

        }