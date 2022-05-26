public class Book {
    private String author;
    private String title;

    //    private Book(String author, String title) {
//        this.author = author;
//        this.title = title;
//    }
//
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
