package com.kodila.collections.adv.immutable;

public class Book {
    protected final String author;
    protected final String theTitle;

    public Book(String author, String title) {
        this.author = author;
        this.theTitle = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTheTitle() {
        return theTitle;
    }

}
