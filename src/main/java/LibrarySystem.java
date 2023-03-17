import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class LibrarySystem {
    private List<User> users;
    private List<Book> books;
    private List<Lending> lendings;

    public LibrarySystem() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
        this.lendings = new ArrayList<>();
    }

    public void borrowBook(User user, Book book) {
        Lending lending = new Lending(book, user);
        lendings.add(lending);
    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) {
        Lending lending = new Lending(book, facultyMember);
        lending.setDueDate(newDueDate);
        lendings.add(lending);
    }

    public void returnBook(User user, Book book) {
        Lending lending = new Lending(book, user);
        lendings.remove(lending);

    }

    public static void main(String[] args) {

    }
}
