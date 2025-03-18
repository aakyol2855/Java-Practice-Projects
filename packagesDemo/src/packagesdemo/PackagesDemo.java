//built-in : java'nın içerisinde olan fonksiyonlar/paketler
package packagesdemo;

import Matematik.*;//Matematik altındaki tüm classları ekler.
import Matematik.DortIslem;
import Matematik.LogaritmikHesaplamalar;
import java.util.Scanner;

public class PackagesDemo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İstediğiniz bir şey giriniz =>");
        String a = scanner.nextLine();
        System.out.println("Girilen Girdi =>"+a);
        
        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2, 30);
        
        LogaritmikHesaplamalar logaritma = new LogaritmikHesaplamalar();
        
    }
    
}
