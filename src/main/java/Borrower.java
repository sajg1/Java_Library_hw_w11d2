import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bag;
    private int bagCapacity;

    public Borrower(int bagCapacity) {
        this.bag = new ArrayList<Book>();
        this.bagCapacity = bagCapacity;
    }

    public int bookCount() {
        return this.bag.size();
    }

    public void takeBookFromShelf(Library library) {
        if ( this.bag.size() < this.bagCapacity ) {
            Book book = library.removeBook();
            this.bag.add(book);
        }
    }
}
