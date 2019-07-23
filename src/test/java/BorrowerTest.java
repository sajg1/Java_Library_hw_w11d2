import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Library library2;
    private Book book;
    private Book book2;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(1);
        library2 = new Library(2);
        book = new Book();
        book2 = new Book();
        borrower = new Borrower(1);
    }

    @Test
    public void hasemptyBag() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canTakeBookFromShelf() {
        library.addBook(book);
        borrower.takeBookFromShelf(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }

    @Test
    public void cannotTakeABookIfGreaterThanCapacity() {
        library2.addBook(book2);
        library2.addBook(book2);
        assertEquals(2, library2.bookCount());
        borrower.takeBookFromShelf(library2);
        borrower.takeBookFromShelf(library2);
        assertEquals(1, borrower.bookCount());
        assertEquals(1, library2.bookCount());
    }
}
