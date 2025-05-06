package lab_3_library;

public class Main {
    public static void main(String[] args) {
        BookFactory factory = new BookFactory();

        Book book1 = factory.getBook("Кобзар", "Тарас Шевченко");
        Book book2 = factory.getBook("Кобзар", "Тарас Шевченко");

        BookCopy copy1 = new BookCopy(1, book1);
        BookCopy copy2 = new BookCopy(2, book2);

        Reader reader = new Reader("Олена");
        Library library = new Library();

        reader.orderBook(copy1);
        library.issueBook(copy1, true);

        reader.orderBook(copy2);
        library.issueBook(copy2, false);
    }
}