package Jan23;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(){
        title = "Test Title";
        author = "Test Author";
        publicationYear = 1989;
    }

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public void printBookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publication year: "+publicationYear);
    }
}
