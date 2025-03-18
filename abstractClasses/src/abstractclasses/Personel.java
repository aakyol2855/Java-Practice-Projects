package abstractclasses;

public abstract class Personel {
    static final String sirketIsmi = "Akyol Oto";
    static final String sirketAdresi = "İstanbul / Türkiye";
    
    protected String isim = "Değer girilmemiş";
    protected String soyIsim = "Değer girilmemiş";
    protected String tcNo = "Değer girilmemiş";
    protected String telefon = "Değer girilmemiş";
    protected String iseBaslamaTarihi = "Değer girilmemiş";
    protected String sigortaNo = "Değer girilmemiş";
    static int personelSayac = 1000;
    
    protected String personelNo ; 
    
    protected String personelNo(){
        personelSayac++;
        String no = personelSayac+"";
        return no;
    }
    
}
