package com.kodila.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Stewart", "The last chance");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("New theTitle");
        System.out.println(book.getTheTitle());
    }
}