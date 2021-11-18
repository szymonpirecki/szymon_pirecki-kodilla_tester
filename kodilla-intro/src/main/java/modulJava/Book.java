package modulJava;

public class Book {
    private String author;
    private String title;

    private Book(String author, String title){
        this.author = author;
        this.title = title;
    }


    public static Book of(String author, String title) {
//      niepotrzebne//  modulJava.Book book = new modulJava.Book(author, title);
        return new Book(author, title);
        }


    public static void main(String[] args){


        Book book = Book.of("Sapkowski", "Wiedzmin");
        Book book1 = Book.of("Orwell","1984");
        Book book2 = Book.of("Kafka", "Proces");
        Book book3 = new Book("Rekowski", "Mikroekonomia");


    }
}
