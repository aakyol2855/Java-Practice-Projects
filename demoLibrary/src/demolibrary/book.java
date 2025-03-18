package demolibrary;

public class book {
    private String title;
    private String author;
    private int year;
    
    book(String title,String author,int year){
        this.title = title;
        this.author = author;
        this.year = year;
        
    }
    public void displayInf(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.year);
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
}
