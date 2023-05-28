public class Books {
    private String bookName = "";
    private int numPages;
    private int publicationYear;

    public Books(String name, int pages, int year) {
        this.bookName = name;
        this.numPages = pages;
        this.publicationYear = year;
    }

    public String getName() {
        return this.bookName;
    }

    public int getNumOfPages() {
        return this.numPages;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public String toString() {
        return (this.bookName + ", " + this.numPages + " pages, " + this.publicationYear
        );
    }
}