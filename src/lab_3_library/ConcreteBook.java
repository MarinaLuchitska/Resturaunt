package lab_3_library;

public class ConcreteBook implements Book {
    private String title;
    private String author;

    public ConcreteBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author);
    }
}
