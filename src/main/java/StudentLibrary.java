import java.util.*;
import java.util.function.Predicate;

public class StudentLibrary implements Library {
    //private static StudentLibrary instance = new StudentLibrary();
    private List<Book> books = new LinkedList<>();
    private Map<String, Book> issuedBooks = new HashMap<String, Book>();

    public StudentLibrary() {
    }

    /*public static StudentLibrary getInstance(){
        return instance;
    }*/

    public void addNewBook(Book book){
            check(book);
            books.add(book);
    }

    public void borrowBook(Book book, String student){
        fullCheck(book,student);
        issuedBooks.put(student,book);
        book.setAvailable(false);

    }

    public void returnBook(Book book, String student){
        fullCheck(book,student);
        issuedBooks.remove(student,book);
        book.setAvailable(true);
    }

    public List<Book> findAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book:books){
            if(book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    private void check(Book book) {
        if ((book.getId()<=0)) {
            throw new RuntimeException("Операция прервана. Поле Id должно быть больше 0!");
        }
        else if(book.getTitle().trim().equals("")&&book.getTitle()==null)
        {
            throw new RuntimeException("Операция прервана. Поле Title не должно быть пустым!");
        }
    }

    private void fullCheck(Book book, String student)  {
        if(student.trim().equals("")&&student==null)
        {
            throw new RuntimeException("Операция прервана. Поле Student не должно быть пустым!");
        }
        else if(books.indexOf(book)==-1){
            throw new RuntimeException("Операция прервана. Такая книга в библиотеке не зарегистрирована!");
        }
        check(book);
    }

    public List<Book> getAllBook(){
        return books;
    }
}
