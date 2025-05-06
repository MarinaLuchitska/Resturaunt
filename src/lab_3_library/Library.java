package lab_3_library;

public class Library {
    public void issueBook(BookCopy copy, boolean toReadingRoom) {
        System.out.println("Видача книги " + (toReadingRoom ? "в читальний зал" : "на абонемент"));
        copy.show();
    }
}