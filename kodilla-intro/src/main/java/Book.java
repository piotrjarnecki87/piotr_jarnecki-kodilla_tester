public class Book {
    private String author;
    private String title;

    private Book(String author, String title){
        this.title = title;
        this.author = author;
    }

    public static Book book = Book.of(String this.author, String this.title);{
        return Book(author, title)
    }

    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }

}
