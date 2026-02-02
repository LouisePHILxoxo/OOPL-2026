package activity1;

public class Main1 {
    public static void main(String[] args) {
     Book book1 = new Book ("To Kill a Mockingbird", "Harper Lee", "978-0061120084", "July 11, 1960");
     Book book2 = new Book ("1984", "George Orwell", "978-0451524935", "June 9, 1949");
     Book book3 = new Book ("The Hobbit", "J.R.R. Tolkien", "978-0547928227", "September 21, 1937");
     Book book4 = new Book ("Pride and Prejudice", "Jane Austen", "978-1503290563", "January 28, 1813");

     book1.printBookInfo();
     book2.printBookInfo();
     book3.printBookInfo();
     book4.printBookInfo();
    }
}
