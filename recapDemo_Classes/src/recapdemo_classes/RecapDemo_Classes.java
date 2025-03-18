package recapdemo_classes;

import java.util.Scanner;

public class RecapDemo_Classes {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println("Lütfen yapacağınız işlemi seçiniz (Toplama Cikartma Carpma Bolme)");
        Scanner s=new Scanner(System.in);
        String işlem=s.nextLine();
        if(işlem.equals("Toplama") || işlem.equals("toplama")){
            System.out.println("Lütfen toplamak için 2 sayi giriniz.");
            int sayi1=s.nextInt();
            int sayi2=s.nextInt();
            int sonuc = dortIslem.topla(sayi1, sayi2);
            dortIslem.yazdir(sonuc);
        }
        else if (işlem.equals("Cıkartma") || işlem.equals("cikartma")){
            System.out.println("Lütfen çıkartmak için 2 sayi giriniz.");
            int sayi1=s.nextInt();
            int sayi2=s.nextInt();
            int sonuc = dortIslem.cıkart(sayi1, sayi2);
            dortIslem.yazdir(sonuc);
        }
        else if (işlem.equals("Carpma") || işlem.equals("carpma")){
            System.out.println("Lütfen çarpmak için 2 sayi giriniz.");
            int sayi1=s.nextInt();
            int sayi2=s.nextInt();
            int sonuc = dortIslem.carp(sayi1, sayi2);
            dortIslem.yazdir(sonuc);
        }
        else if (işlem.equals("Bolme") || işlem.equals("bolme")){
            System.out.println("Lütfen bölmek için 2 sayi giriniz.");
            double sayi1=s.nextInt();
            double sayi2=s.nextInt();
            double sonuc = dortIslem.bol(sayi1, sayi2);
            dortIslem.yazdir2(sonuc);
        }
        else System.out.println("Hatalı girdi kod:404");
    }
    
}
