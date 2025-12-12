public class Main_Class_Book {
    public static void main(String[] args) {
        Class_Book cb = new Class_Book();
        cb.setTitle("Book");
        cb.setAuthor("Author");
        cb.setYear(2018);
        cb.markAsBorrowed();
        cb.markAsReturned();
        System.out.println(cb);
    }
}
