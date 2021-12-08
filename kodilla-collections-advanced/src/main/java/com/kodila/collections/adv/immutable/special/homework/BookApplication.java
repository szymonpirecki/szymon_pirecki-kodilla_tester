package com.kodila.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

import static com.kodila.collections.adv.immutable.special.homework.Book.books;

public class BookApplication {
    public static void main(String[] args) {
        Book book = BookManager.createBook("Opowiadania bizarne", "Tokarczuk");
        Book book1 = BookManager.createBook("Wiedźmin", "Sapkowski");
        Book book2 = BookManager.createBook("Sherlock Holmes", "Doyle");
        Book book3 = BookManager.createBook("Opowiadania bizarne", "Tokarczuk");

        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());


        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println(books.get(2).getAuthor());

    }
}
