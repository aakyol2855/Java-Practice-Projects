/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

/**
 *
 * @author HCLROSS
 */
public class Yolcu extends Kisi {
    private String rezervasyonNumarasi;

    public Yolcu(String ad, Adres adres, String mail, Gun dogumTarihi, float maas, String rezervasyonNumarasi) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.rezervasyonNumarasi = rezervasyonNumarasi;
    }

    public String getRezervasyonNumarasi() {
        return rezervasyonNumarasi;
    }

    public void setRezervasyonNumarasi(String rezervasyonNumarasi) {
        this.rezervasyonNumarasi = rezervasyonNumarasi;
    }
}