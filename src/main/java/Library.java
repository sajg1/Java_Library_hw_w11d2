import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf;
    private int capacity;

    public Library(int capacity) {
        this.shelf = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int bookCount() {
        return this.shelf.size();
    }

    public void addBook(Book book) {
        if (this.shelf.size() < this.capacity) {
            this.shelf.add(book);
        }
    }
}
