package Jan23;

public class BookDemo {
    public static void main(String[] args) {
        Book a = new Book();
        a.printBookDetails();
        System.out.println();
        Book b = new Book("Harry Potter 1", "J.K.Rowling", 2010);
        b.printBookDetails();
        System.out.println();
        Book c = new Book("Harry Potter 2", "J.K.Rowling", 2012);
        c.printBookDetails();
        System.out.println();
        Book d = new Book("Harry Potter 3", "J.K.Rowling", 2014);
        d.printBookDetails();
        System.out.println();
        Book e = new Book("Harry Potter 4", "J.K.Rowling", 2016);
        e.printBookDetails();
    }
}
