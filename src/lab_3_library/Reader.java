package lab_3_library;

public class Reader {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public void orderBook(BookCopy copy) {
        System.out.println(name + " замовив книгу:");
        copy.show();
    }
}
