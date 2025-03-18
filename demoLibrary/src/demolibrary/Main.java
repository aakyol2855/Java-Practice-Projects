package demolibrary;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        book nBook1 = new book("mai ve siyah","Recaizade Mahmut ekrem",1946);
        book nBook2 = new book("Aklından bir sayı tut","John Verdon",2012);
        Scanner s= new Scanner(System.in);
        library lib = new library();
        
        System.out.println("Kütüphaneye kitap eklemek ister misiniz?");
        String choose = s.next();
        if(choose.equals("evet")){
            System.out.println("Kaç kitap gireceksiniz?");
            int choose2 = s.nextInt();
            for (int i = 0; i < choose2; i++) {
                System.out.println("Sırasıyla kitap ismi , yazarı ve basım yılını giriniz : ");
                String title = s.next();
                String author = s.next();
                int year = s.nextInt();
                book nBook = new book(title,author,year);
                lib.addBook(nBook);
            }
        }
        
        lib.addBook(nBook1);
        lib.addBook(nBook2);
        lib.displayBooks(); 
    }
    
}
