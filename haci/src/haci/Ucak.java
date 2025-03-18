/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

/**
 *
 * @author HCLROSS
 */
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Ucak {

    private String tip;
    private int kapasite;
    private int uretimYili;
    private List<Ucus> ucuslar;
    private List<KabinEkibi> kabinEkibi;

    public Ucak(String tip, int kapasite, int uretimYili) {
        this.tip = tip;
        this.kapasite = kapasite;
        this.uretimYili = uretimYili;
        this.ucuslar = new ArrayList<>();
        this.kabinEkibi = new ArrayList<>();
    }

    // Get ve Set metodları
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public List<Ucus> getUcuslar() {
        return ucuslar;
    }

    public List<KabinEkibi> getKabinEkibi() {
        return kabinEkibi;
    }

    // Uçuş ve kabin ekibi ekleme işlemleri
    public void ucusEkle(Ucus ucus) {
        this.ucuslar.add(ucus);
    }

    public void kabinEkibiEkle(KabinEkibi ekip) {
        this.kabinEkibi.add(ekip);
    }
}
