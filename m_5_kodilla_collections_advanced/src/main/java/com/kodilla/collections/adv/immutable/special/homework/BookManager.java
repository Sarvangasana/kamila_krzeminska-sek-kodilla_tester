package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> list = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
         for (Book book : list)
            if (book.equals(newBook))
                System.out.println("Such book: " + newBook.getTitle()  + ", " + newBook.getAuthor()
                        + " - (of the same author, with the same title) already exists in the list.");
                list.add(newBook);
                return newBook;
    }
}
