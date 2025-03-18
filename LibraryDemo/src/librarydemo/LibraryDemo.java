package librarydemo;

import java.util.Scanner;

public class LibraryDemo {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        library nLibrary = new library();
        
        System.out.println("Kaç kitap eklemek istersiniz?");
        int counter = s.nextInt();
        for(int i = 0 ; i < counter ; i++){
            System.out.println("Eklenecek kitabın, sırasıyla isim,yazar ve basım yılını yazınız :");
            String title = s.next();
            String author = s.next();
            int year = s.nextInt();
            Book nBook = new Book(title , author , year);
            nLibrary.addBook(nBook);
        }
        nLibrary.displayBooks();
    }
    
}
