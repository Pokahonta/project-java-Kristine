package WorkShop;

public class Book {
    private String author = "";
    private String originalName = "";
    private String name = "";
    private int year = 2000;

    //-----constructor-----//
    public Book (String author, String originalName, String name, int year) {
        this.author = author;
        this.originalName = originalName;
        this.name = name;
        this.year = year;
    }
}
