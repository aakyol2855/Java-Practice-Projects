import java.util.ArrayList;
import java.util.List;

public class Banka {
    private String bankaAdi;
    private String adres;
    private List<Musteri> musteriler;
    private List<Hesap> hesaplar;
    private List<Kredi> krediler;

    public Banka(String bankaAdi, String adres) {
        this.bankaAdi = bankaAdi;
        this.adres = adres;
        this.musteriler = new ArrayList<>();
        this.hesaplar = new ArrayList<>();
        this.krediler = new ArrayList<>();
    }

    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }

    public void hesapEkle(Hesap hesap) {
        hesaplar.add(hesap);
    }
    public void krediEkle(Kredi kredi){
        krediler.add(kredi);
    }

    public Musteri musteriBul(String tcKimlikNo){
        for(Musteri musteri:musteriler){
            if (musteri.getTcKimlikNo().equals(tcKimlikNo)) {
                return musteri;
            }
        }
        return null;
    }
    public Hesap hesapBul(int hesapNumarasi){
        for(Hesap hesap:hesaplar){
            if(hesap.getHesapNumarasi()==hesapNumarasi) {
                return hesap;
            }
        }
        return null;
    }
    public void paraTransferi(int kaynakHesapNumarasi, int hedefHesapNumarasi, double miktar){
        Hesap kaynakHesap=hesapBul(kaynakHesapNumarasi);
        Hesap hedefHesap=hesapBul(hedefHesapNumarasi);
        if(kaynakHesap!=null && hedefHesap!=null){
            kaynakHesap.paraTransferi(hedefHesapNumarasi,miktar);
        }
        else{
            System.out.println("Kaynak hesap veya hedef hesap boş")
        }
    }
    public void gunlukFaizHesapla(double faizOrani){
        for(Hesap hesap:hesaplar){
            hesap.gunlukFaizHesapla(faizOrani);
        }
    }
    public void musterileriRaporla(){
        System.out.println("Banka müsterileri: ");
        for(Musteri musteri:musteriler){
            System.out.println(musteri);
        }
    }
    public void krediBasvurulariniRaporla(){
        System.out.println("Kredi Başvuruları: ");
        for(Kredi kredi:krediler){
            System.out.println(kredi);
        }
    }

}
