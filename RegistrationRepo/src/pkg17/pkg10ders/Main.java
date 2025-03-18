package pkg17.pkg10ders;
public class Main {


    public static void main(String[] args) {
//        c dilinin include işlemi ile class tanımlama ya da nesne inport etme arasındaki fark nedir?
        KullaniciKayit id1= new KullaniciKayit();
        id1._kullaniciAdi="Abdulvahab";
        id1._kullaniciSoyadi="Akyol";
        id1._aracModel="Tofaş slx";
        id1._aracYas=18;
        String ad=id1.Name();
        String model =model=id1.model();
        String soyad=id1.Surname();
        int yas=id1.carAge();
        System.out.println("İsim => "+ad+"\nSoyisim => "+soyad+"\nAraç modeli => "+model+"\nAraç yaşı => "+yas);
        
    }
    
}
