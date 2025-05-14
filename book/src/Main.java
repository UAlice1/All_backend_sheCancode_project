import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {

      book bookclass = new book( "Love ansd scret","Marthin Ruther king");
        System.out.println("the Auther:" + bookclass.getAuthor());
        System.out.println("the title:" +  bookclass.getTitle() );
    }
}