package model;

public class Book {
    private int bookId;
    private String tittle;
    private String author;
    private String category;
    private String Available;


    public Book() {
    }

    public Book(int bookId, String tittle, String author, String category, String available) {
        this.bookId = bookId;
        this.tittle = tittle;
        this.author = author;
        this.category = category;
        Available = available;
    }

    public Book(int bookId, String tittle, String author, String category) {
        this.bookId = bookId;
        this.tittle = tittle;
        this.author = author;
        this.category = category;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvailable() {
        return Available;
    }

    public void setAvailable(String available) {
        Available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", Available='" + Available + '\'' +
                '}';
    }
}
