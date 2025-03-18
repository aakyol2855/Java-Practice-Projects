package librarydemo;

public class library {
    private Book[] books;
    private int bookCount;
    
    public library() {
        books = new Book[20];
        bookCount= 0;
    }
    
    public void addBook(Book book){
        if(bookCount<books.length){
            books[bookCount] = book;
            bookCount++;
        }
        else System.out.println("Kütüphane dolu , Eklenemedi!");
    }
    
    public void displayBooks(){
        System.out.println("Kütüphanede yer alan kitap isimleri : ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i+1)+".Kitap : ");
            System.out.println(books[i]);
        }
    }

}
