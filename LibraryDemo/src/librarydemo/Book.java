package librarydemo;

public class Book {

    protected String title;
    protected String author;
    protected int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Kitap Adı :" + title);
        System.out.println("Yazar Adı :" + author);
        System.out.println("Üretim Yılı :" + year);
    }
}
