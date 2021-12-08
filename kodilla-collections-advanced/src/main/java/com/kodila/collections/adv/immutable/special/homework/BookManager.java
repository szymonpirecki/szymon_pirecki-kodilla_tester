package com.kodila.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

import static com.kodila.collections.adv.immutable.special.homework.Book.books;

public class BookManager {

    public static Book createBook(String title, String author) {
        for (Book position : books) {
            if (author.equals(position.getAuthor()) && title.equals(position.getTitle())) {
                return null;
            } else
                return new Book(title, author);
        }
    }
}
