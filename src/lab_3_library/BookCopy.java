package lab_3_library;

public class BookCopy {
    private int id;
    private Book book;

    public BookCopy(int id, Book book) {
        this.id = id;
        this.book = book;
    }

    public void show() {
        System.out.print("ID: " + id + " - ");
        book.displayInfo();
    }
}
