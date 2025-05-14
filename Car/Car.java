public class Car {

    String make="Ford";
    String model= "Mustang";
    int year=2025;
    double price = 58000.99;
     boolean isRunnning =false;

       void  start (){
           isRunnning=true;
          System.out.println("you start engine");

      }
   void stop (){
           isRunnning=false;
         System.out.println("you stop the engine ");

     }
     void  drive(){
         System.out.println("you drive " + model);

     }
     void brake (){
         System.out.println("you brake the " + make );
     }

    void cost() {
        System.out.println("This " + model + " its cost is " + price + ", year " + year);
    }
}
