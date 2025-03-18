/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

public class Havalimani {
    private String isim;
    private String kod;
    private Konum konum;
    private Yonetici yonetici;

    public Havalimani(String isim, String kod, Konum konum, Yonetici yonetici) {
        this.isim = isim;
        this.kod = kod;
        this.konum = konum;
        this.yonetici = yonetici;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public Konum getKonum() {
        return konum;
    }

    public void setKonum(Konum konum) {
        this.konum = konum;
    }

    public Yonetici getYonetici() {
        return yonetici;
    }

    public void setYonetici(Yonetici yonetici) {
        this.yonetici = yonetici;
    }
}
