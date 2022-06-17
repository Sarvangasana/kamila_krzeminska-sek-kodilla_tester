public class Book {
    private String author;
    private String title;

    // I sposób:
    public static Book of(String author, String title) {
        Book newBook = new Book();
        newBook.author = author;
        newBook.title = title;
        return newBook;
    }
//    II sposób:
//    static Book of(String author, String title) {
//        return new Book(author, title);
//    }
}
