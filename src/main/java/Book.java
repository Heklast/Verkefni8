import java.util.List;

/******************************************************************************
 *  Nafn: Hekla Scheving Thorsteinsson
 *  Tölvupóstur: hst10@hi.is
 *
 *  Lýsing: Lýsing á hvað forritið gerir, inntak, útreikningar, úttak
 *
 *
 *****************************************************************************/


public class Book {
    private String title;
    private List<Author> authors;


    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        if (authors == null) throw new EmptyAuthorListException("No authors in the list");
        else this.authors = authors;

    }

    public List<Author> getAuthors() throws EmptyAuthorListException {
        if (authors == null) {
            throw new EmptyAuthorListException("No authors in the list");
        } else
            return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        if (authors == null) {
            throw new EmptyAuthorListException("No authors in the list");
        } else this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
