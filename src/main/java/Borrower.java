import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bag;

    public Borrower() {
        this.bag = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.bag.size();
    }

    public void takeBookFromShelf(Library library) {
        Book book = library.removeBook();
        this.bag.add(book);
    }
}
