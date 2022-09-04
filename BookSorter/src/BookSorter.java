

public class BookSorter implements Comparable<BookSorter>{
    //Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.

    private String bookName;
    private int pageNumber;
    private String authorName;
    private String  publishDate;

    public BookSorter(String bookName, int pageNumber, String authorName, String  publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public BookSorter() {
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String  publishDate) {
        this.publishDate = publishDate;
    }




    @Override
    public int compareTo(BookSorter o) {
        return getBookName().compareTo(o.getBookName());
    }
}
