package aractakip;

import aractakip.CarInformations;
import java.util.Scanner;

public class Cars {
    
    public static void main(String[] args) {
        Scanner nScanner = new Scanner (System.in);
        FileManagement newCase = new FileManagement();
        CarInformations nCar = new CarInformations();
        String pathAddress = "C:\\Users\\aakyol28\\Documents\\NetBeansProjects\\AracTakip\\src\\aractakip\\";
        newCase.createFile(pathAddress+"arac_bilgileri.txt");

        System.out.println("Yeni kayıt açmak ister misiniz?");
        String choose = nScanner.nextLine();
        if(choose.equals("evet")){
            System.out.println("Kullanici için ad ve sifre belirleyim =>");
            String _kullaniciAdi =nScanner.nextLine();
            int _kullaniciSifre = nScanner.nextInt();
            kullaniciBilgileri  nKullanici = new kullaniciBilgileri(_kullaniciAdi,_kullaniciSifre);
            nKullanici.dataGirisi();
            nCar.aracBilgileriniGir(_kullaniciAdi,pathAddress);
        }
        System.out.println("Lütfen kullanıcı adı ve şifrenizi giriniz =>");
        String kAdi = nScanner.nextLine();
        String sifreString = nScanner.nextLine();
        int kSifre;
        try {
            kSifre = Integer.parseInt(sifreString);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz şifre!");
            return; 
        }
        
        String veri = kAdi + " "+ kSifre;
       
        if(newCase.searchInTextFile(pathAddress+"KullaniciBilgileri.txt", kAdi + " "+ kSifre)){
            System.out.println("Hoşgeldiniz!");
            CarInformations myCar = new CarInformations();
            nCar.aracBilgileriniYazdir(kAdi,pathAddress);
        }
        
        System.out.println("Program bitti");
        
    }
}

