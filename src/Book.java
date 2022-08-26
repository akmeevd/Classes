public class Book {
    private String name;
    private int publishingYear;

    private String author;

    public Book(String name, String author, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;

    }

}
