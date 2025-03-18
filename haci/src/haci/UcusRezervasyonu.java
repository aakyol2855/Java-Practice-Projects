/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

/**
 *
 * @author HCLROSS
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UcusRezervasyonu {
    private String rezervasyonNo;
    private Ucus ucus;
    private Map<Yolcu, UcusKoltugu> koltuklar; // Her yolcu için koltuk bilgisi
    private RezervasyonDurumu durum;
    List<Yolcu> yolcular = new ArrayList<>();
    

    // Yapıcı metot, Map<Yolcu, UcusKoltugu> nesnesini burada oluşturuyoruz
    public UcusRezervasyonu(String rezervasyonNo, Ucus ucus, RezervasyonDurumu durum) {
        this.rezervasyonNo = rezervasyonNo;
        this.ucus = ucus;
        this.koltuklar = new HashMap<>(); // Koltuk bilgilerini saklayacak harita
        this.durum = durum;
    }

    // Koltuk ekleme işlemi
    public void koltukEkle(Yolcu yolcu, String koltukNo, String sinif,KoltukTuru koltukTuru) {
        UcusKoltugu koltuk = new UcusKoltugu(koltukNo,koltukTuru, sinif);
        koltuklar.put(yolcu, koltuk); // Yolcu ve koltuğu haritaya ekle
        System.out.println("Yolcu " + yolcu.getAd() + " için koltuk atandı: " + koltukNo);
    }
    public List<Yolcu> getYolcu(){
        int rezNo = Integer.parseInt(rezervasyonNo);
        if (yolcular.contains(rezNo)) {
            return (List<Yolcu>) yolcular.get(rezNo);
        } else {
            System.out.println("Rezervasyon numarası bulunamadı.");
            return null;
        }
        
    }

    // Koltukları döndürme işlemi
    public Map<Yolcu, UcusKoltugu> getKoltuklar() {
        return koltuklar;
    }

    // Getters and Setters
    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

    public Ucus getUcus() {
        return ucus;
    }

    public void setUcus(Ucus ucus) {
        this.ucus = ucus;
    }

    public RezervasyonDurumu getDurum() {
        return durum;
    }

    public void setDurum(RezervasyonDurumu durum) {
        this.durum = durum;
    }

    // Rezervasyon yapma ve iptal etme gibi işlemler
    public boolean rezervasyonYap() {
        this.durum = RezervasyonDurumu.Onaylandi;
        System.out.println("Rezervasyon başarıyla yapıldı.");
        return true;
    }

    public boolean rezervasyonIptalEt() {
        this.durum = RezervasyonDurumu.IptalEdildi;
        System.out.println("Rezervasyon iptal edildi.");
        return true;
    }

    public boolean odemeYap() {
        if (this.durum == RezervasyonDurumu.Onaylandi) {
            System.out.println("Ödeme başarıyla yapıldı.");
            return true;
        } else {
            System.out.println("Ödeme işlemi başarısız. Rezervasyon durumu uygun değil.");
            return false;
        }
    }
}
