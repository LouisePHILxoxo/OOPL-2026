package activity1;

public class Book {
    String title;
    String author;
    String isbn;
    String publicationDate;

    public Book(String t, String a, String i, String pDate) {
        title = t;
        author = a;
        isbn = i;
        publicationDate = pDate;
    }

    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println();
    }
}