package org.example;

public  class Name {
     String firstname;
    String lastname;
    int age;
    int year;

    Name(String firstname, String lastname, int age) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.age=age;
    }


     Name(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

   Name (String firstname,String lastname,int age,int year ){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.year=year;

   }

    @Override
    public String toString() {
        return
                 firstname  +' '+
                lastname + ' ' +
            age + ' ' +
                 year
                ;
    }
}
