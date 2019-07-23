import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library(1);
        book = new Book();
        borrower = new Borrower();
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
}
