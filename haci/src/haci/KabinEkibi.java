package haci;

import java.util.List;

public class KabinEkibi extends Kisi {

    private List<Ucus> ucuslar; // Kabin ekibinin atanmış olduğu uçuşlar
    private float toplamSaat;   // Çalışılan toplam saat
    private int toplamUcus;     // Gerçekleştirilen toplam uçuş sayısı
    private float temelMaas;    // Kabin ekibinin temel maaşı

    // Constructor
    public KabinEkibi(String ad, Adres adres, String mail, Gun dogumTarihi, float temelMaas, List<Ucus> ucuslar, float toplamSaat, int toplamUcus) {
        super(ad,dogumTarihi,katagori);
        this.ucuslar = ucuslar;
        this.toplamSaat = toplamSaat;
        this.toplamUcus = toplamUcus;
        this.temelMaas = temelMaas;
    }

    // Getter ve Setter metodları
    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    public void setUcuslar(List<Ucus> ucuslar) {
        this.ucuslar = ucuslar;
    }

    public float getToplamSaat() {
        return toplamSaat;
    }

    public void setToplamSaat(float toplamSaat) {
        this.toplamSaat = toplamSaat;
    }

    public int getToplamUcus() {
        return toplamUcus;
    }

    public void setToplamUcus(int toplamUcus) {
        this.toplamUcus = toplamUcus;
    }

    public float getTemelMaas() {
        return temelMaas;
    }

    public void setTemelMaas(float temelMaas) {
        this.temelMaas = temelMaas;
    }

    // toString metodu (KabinEkibi nesnesini anlamlı bir şekilde temsil etmek için)
    @Override
    public String toString() {
        return "KabinEkibi{"
                + "isim='" + getAd() + '\''
                + ", toplamSaat=" + toplamSaat
                + ", toplamUcus=" + toplamUcus
                + ", temelMaas=" + temelMaas
                + '}';
    }
}
