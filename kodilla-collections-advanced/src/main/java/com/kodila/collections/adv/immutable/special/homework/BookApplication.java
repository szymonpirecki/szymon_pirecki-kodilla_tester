package com.kodila.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookApplication {
    public static void main(String[] args) {
        Book book = BookManager.createBook("Opowiadania bizarne", "Tokarczuk");
        Book book1 = BookManager.createBook("Wiedźmin", "Sapkowski");
        Book book2 = BookManager.createBook("Sherlock Holmes", "Doyle");
        Book book3 = BookManager.createBook("Opowiadania bizarne", "Tokarczuk");

        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));
        System.out.println(book1.equals(book2));
        System.out.println(book.equals(book3));

        System.out.println(book.hashCode());
        System.out.println(book3.hashCode());

        System.out.println(book.getAuthor());
        System.out.println(book3.getAuthor());

    }
}
