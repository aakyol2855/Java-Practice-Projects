package demolibrary;

public class library {
    private book[] books;
    private int bookCount;
    library(){
        books = new book[20];
        bookCount = 0;
    }
    public void addBook(book book){
        if(bookCount<books.length){
            books[bookCount] = book;
            bookCount++;
        }
        else System.out.println("Kütüphane dolu, yeni kitap verisi eklenemedi!");
    }
    
    public void displayBooks(){
        System.out.println("Kütüphanede yer alan kitaplar : ");
        System.out.println("-------------");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i+1)+".Kitap bilgileri : ");
            books[i].displayInf();
            System.out.println("-------------");
        }
    }
}
