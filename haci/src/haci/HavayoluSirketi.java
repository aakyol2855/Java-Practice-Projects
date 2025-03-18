
package haci;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HavayoluSirketi {
    private String ad;
    private int kod;
    private List<Havalimani> havalimanlariList;
    private List<Ucus> ucuslar;

    public HavayoluSirketi(String ad, int kod) {
        this.ad = ad;
        this.kod = kod;
        this.havalimanlariList = new ArrayList<>();
        this.ucuslar = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public List<Havalimani> getHavalimanlariList() {
        return havalimanlariList;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    // CRUD İşlemleri
    public void addHavalimani(Havalimani havalimani) {
        havalimanlariList.add(havalimani);
    }

    public void removeHavalimani(Havalimani havalimani) {
        havalimanlariList.remove(havalimani);
    }

    public void addUcus(Ucus ucus) {
        ucuslar.add(ucus);
    }

    public void removeUcus(Ucus ucus) {
        ucuslar.remove(ucus);
    }

    
}
