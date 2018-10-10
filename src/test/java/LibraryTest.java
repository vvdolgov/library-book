import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class LibraryTest {

    StudentLibrary studentLibrary;

    @Before
    public void init() {
        studentLibrary = new StudentLibrary();
    }

    @Test
    public void testAddBook() {
        Book b1 = new Book(1, "Горе от ума");
        studentLibrary.addNewBook(b1);
        List<Book> books = new LinkedList<>();
        books.add(b1);
        Assert.assertEquals(studentLibrary.getAllBook(), books);
    }

    @Test
    public void testBorrowBook() {
        Book b1 = new Book(1, "Горе от ума");
        studentLibrary.addNewBook(b1);
        studentLibrary.borrowBook(b1, "Sam");
        Assert.assertFalse(b1.isAvailable());
    }

    @Test
    public void testReturnBook() {
        Book b1 = new Book(1, "Горе от ума");
        studentLibrary.addNewBook(b1);
        studentLibrary.borrowBook(b1, "Sam");
        studentLibrary.returnBook(b1, "Sam");
        Assert.assertTrue(b1.isAvailable());
    }

    @Test
    public void testThrowingException() {
        try {
            Book b1 = new Book(1, "Горе от ума");
            studentLibrary.borrowBook(b1, "Sam");
            Assert.fail();
        } catch (RuntimeException e) {
            Assert.assertEquals(e.getMessage(), "Операция прервана. Такая книга в библиотеке не зарегистрирована!");
        }
    }
}
