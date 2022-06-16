package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Armageddon", "Ken Watanabe");
        Book book2 = BookManager.createBook("Mysterious garden", "Agnieszka Holland");
        Book book3 = BookManager.createBook("Manitou", "Big Foot");
        Book book4 = BookManager.createBook("Armageddon", "Ken Watanabe");

        System.out.println(book1 == book4); // adresy obiektów (2 książek o takim samym tytule i autorze) - różnią się
        System.out.println(book1.equals(book4)); // obiekty, tj. książka o takim samym tytule i autorze - nie różnią się
    }
}
