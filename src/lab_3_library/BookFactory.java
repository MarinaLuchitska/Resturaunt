package lab_3_library;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, Book> books = new HashMap<>();

    public Book getBook(String title, String author) {
        String key = title + "_" + author;
        Book book = books.get(key);
        if (book == null) {
            book = new ConcreteBook(title, author);
            books.put(key, book);
        }
        return book;
    }
}
