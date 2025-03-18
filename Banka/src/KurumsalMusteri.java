import java.util.List;

public class KurumsalMusteri extends Musteri {

    private String sirketAdi;
    private String vergiNo;
    private String telefonNumarasi;
    private String email;
    private List<Hesap> hesaplar;

    public KurumsalMusteri(String ad, String soyad, String tcKimlikNo, String sirketAdi, String vergiNo, String telefonNumarasi, String email, List<Hesap> hesaplar) {
        super(ad, soyad, tcKimlikNo);
        this.sirketAdi = sirketAdi;
        this.vergiNo = vergiNo;
        this.telefonNumarasi = telefonNumarasi;
        this.email = email;
        this.hesaplar = hesaplar;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    kurumsalBilgileriGoruntule()
    vergiBilgisiGuncelle(String yeniVergiNo)
    krediBasvurusuYap(String krediTuru, double talepEdilenMiktar, int vade)
    hesapOzetiGoruntule(int hesapNumarasi)


}
