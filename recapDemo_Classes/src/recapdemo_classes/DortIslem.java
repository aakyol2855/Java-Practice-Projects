package recapdemo_classes;

public class DortIslem {
    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int cıkart(int sayi1,int sayi2){
        if(sayi1<sayi2) return (sayi2-sayi1);
        else return (sayi1-sayi2);
    }
    public int carp(int sayi1,int sayi2){
        return sayi1*sayi2;
    }
    public double bol(double sayi1,double sayi2){
        if(sayi1 != 0 && sayi2 != 0){
            if(sayi1<sayi2) return sayi2/sayi2;
            else return sayi1/sayi2;
        }
        else return (0);
    }
    public void yazdir(int sonuc){
        System.out.println("Sonuç =>"+sonuc);
    }
    public void yazdir2(double sonuc){
        System.out.println("Sonuç =>"+sonuc);
    }
    
}
