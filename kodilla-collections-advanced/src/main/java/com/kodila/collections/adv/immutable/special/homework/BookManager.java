package com.kodila.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;


public class BookManager {

    private static List<Book> books = new ArrayList<>();
    static boolean dubel;

    public static Book createBook(String title, String author) {
        for (Book position : books) {
            boolean dubel = author.equals(position.getAuthor()) && title.equals(position.getTitle());
       if(dubel){
           return position;
        }
        }
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }
}
















