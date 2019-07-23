import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(1);
        book = new Book();
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToShelf() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void libraryHasCapacity() {
        assertEquals(1, library.getCapacity());
    }

    @Test
    public void cannotAddIfCapacityReached() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBookFromShelf() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
        library.removeBook();
        assertEquals(0, library.bookCount());
    }

}
