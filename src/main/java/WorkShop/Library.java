package WorkShop;

public class Library {
    private String bookAuthor;
    private String bookOriginalName;
    private String bookName;
    private int bookYear;

    public Library(){}

    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookOriginalName() {
        return bookOriginalName;
    }
    public void setBookOriginalName(String bookOriginalName) {
        this.bookOriginalName = bookOriginalName;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}
