public class Book {
    private String author;
    private String title;

//    static Book of(String author, String title) {
//        return new Book(author, title);
//    }

    public static Book of(String author, String title) {
        Book newBook = new Book();
        newBook.author = author;
        newBook.title = title;
        return newBook;
    }

}
