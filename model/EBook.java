package model;

public class EBook extends Book{

    private int fileSizeMB;
    private String downloadUrl;

    public EBook() {
    }

    public EBook(int fileSizeMB, String downloadUrl) {
        this.fileSizeMB = fileSizeMB;
        this.downloadUrl = downloadUrl;
    }

    public EBook(int bookID, String title, String author, String category, int fileSize, String bookURL) {
        super.setBookId(bookID);
        super.setTittle(title);
        super.setAuthor(author);
        super.setCategory(category);
        fileSizeMB = fileSize;
        downloadUrl = bookURL;
    }

    public int getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(int fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public String toString() {
        return "EBook{" +
                "fileSizeMB=" + fileSizeMB +
                ", downloadUrl='" + downloadUrl + '\'' +
                '}';
    }
}
