import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String ad;
    private String soyad;
    private String tcKimlikNo;
    private List<Hesap> hesaplar;

    public Musteri(String ad, String soyad, String tcKimlikNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlikNo = tcKimlikNo;
        this.hesaplar = new ArrayList<>();
    }

    public void hesapEkle(Hesap hesap){
        hesaplar.add(hesap);
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void hesapOzetiGoruntule(int hesapNumarasi){
        Hesap hesap=hesapBul(hesapNumarasi);
        if(hesap!=null){
            hesap.hesapOzetiBilgileriniGoruntule();
        }
        else {
            System.out.println("Hesap Bulunamadı...");
        }

    }
    public void krediBasvurusuYap(Kredi kredi){
        kredi.setMusteri(this);
        kredi.krediHesapla();
    }
    public Hesap hesapBul(int hesapNumarasi){
        for(Hesap hesap:hesaplar){
            if(hesap.getHesapNumarasi()==hesapNumarasi) {
                return hesap;
            }
        }
        return null;
    }


}
