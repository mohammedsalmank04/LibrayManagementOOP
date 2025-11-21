package model;

public class PrintedBook extends Book{

    private int numOfPages;

    private int rackNumber;

    public PrintedBook() {
    }

    public PrintedBook(int numOfPages, int rackNumber) {
        this.numOfPages = numOfPages;
        this.rackNumber = rackNumber;
    }

    public PrintedBook(int bookId, String tittle, String author, String category, int numOfPages, int rackNumber) {
        super(bookId, tittle, author, category);
        this.numOfPages = numOfPages;
        this.rackNumber = rackNumber;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(int rackNumber) {
        this.rackNumber = rackNumber;
    }

    @Override
    public String toString() {
        return "PrintedBook{" +
                "numOfPages=" + numOfPages +
                ", rackNumber=" + rackNumber +
                '}';
    }
}
