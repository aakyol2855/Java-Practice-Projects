package Demoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demoes {

    public static void main(String[] args) throws IOException {
        
        System.out.println("-------------------------------");
        System.out.println("HashMap Kullanımı :");
        System.out.println("-------------------------------");
        
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book", "kitap");//hashmap'e elaman ekleme
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        
        System.out.println(sozluk);
        System.out.println("sozluk eleman sayisi =>"+sozluk.size());
        
        sozluk.remove("table");//hashmap'dan eleman silme
        
        System.out.println("sozluk eleman sayisi =>"+sozluk.size());
        System.out.println(sozluk.get("table"));
        System.out.println(sozluk.get("book"));//key kullarak elemana erişme
        
        System.out.println("----------------");
        for (String item : sozluk.keySet()) {//keyset ile yazdırma
            System.out.println("Eleman =>"+item+" Değer =>"+sozluk.get(item));
        }
        System.out.println("-----------------");
        
        sozluk.clear();//tamamen silme işlemi
        
        System.out.println(sozluk);
        
        
        
        System.out.println("-------------------------------");
        System.out.println("Exceptions(Hatalar ve yönetimi):");
        System.out.println("-------------------------------");

        try {
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(Exception exception){
            System.out.println("Loglandı : "+exception);
        }
        finally{//catch sadece try'da hata oluşursa çalışır. Ancak finally bloğu her zaman çalışır.
            System.out.println("Bu blok her türlü çalışıcak!");
        }
        
        System.out.println("-------------------------------");
        System.out.println("DemoAboutExceptions:");
        System.out.println("-------------------------------");
        
        BufferedReader reader = null;
        int total = 0;
        
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\aakyol28\\Desktop\\coddin\\Java\\Demoes\\src\\Demoes\\sayialr.txt"));
            
            String line = null;
            while((line = reader.readLine())!=null){
                total +=Integer.valueOf(line) ;
            }
            System.out.println("Toplam =>"+total);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }finally{
            reader.close();//io exceptions eklememiz gerekiyor. en yukarıya otomatik ekledi.
        }
        
        
        
    }
    
}
