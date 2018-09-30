import java.util.List;

public interface Library {
    public void addNewBook(Book book) throws Exception;
    public void borrowBook(Book book, String student) throws Exception;
    public void returnBook(Book book, String student) throws Exception;
    List<Book> findAvailableBooks();
}
