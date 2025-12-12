import java.lang.reflect.Constructor;

public class Class_Book {
    private int id;
    private static int idGen;
    private String title;
    private String author;
    private int year;
    private boolean available;
    public Class_Book() {
        idGen = idGen + 1;
        this.id = idGen;
        available = true;
    }
    public Class_Book(String title, String author, int year) {
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }
    int getId() {
        return id;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    int getYear() {
        return year;
    }
    boolean isAvailable() {
        return available;
    }
    public void setTitle(String title) {
        if(title.length()>0){
            this.title = title;
        }
    }
    public void setAuthor(String author) {
        if(author.length()>0){
            this.author = author;
        }
    }
    public void setYear(int year) {
        if(year>=1500 &&  year<=2025) {
            this.year = year;
        }
    }
    public void markAsBorrowed() {
        this.available = false;
    }
    public void markAsReturned() {
        this.available = true;
    }
    public String toString() {
        return ("Id=" + id + ", Title=" + title + ", Author=" + author + ", Year=" + year + ", Available=" + available );
    }
}
