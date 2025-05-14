public class Person {
    private String name ;
    private int age;


    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void getName(){
        System.out.println("name: " + this.name);
    }
    public  void getAge(){
        System.out.println("my age is :" + this.age);
    }

}



