/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

/**
 *
 * @author HCLROSS
 */
public class Odeme {
    private int odemeID;
    private double miktar;
    private OdemeDurumu durum;

    public Odeme(int odemeID, double miktar) {
        this.odemeID = odemeID;
        this.miktar = miktar;
        this.durum = OdemeDurumu.Beklemede;
    }

    public boolean islemYap() {
        // Ödemenin başarılı olup olmadığını kontrol edelim.
        if (this.miktar > 0) {
            this.durum = OdemeDurumu.Tamamlandi;
            return true;
        } else {
            this.durum = OdemeDurumu.Basarisiz;
            return false;
        }
    }

    // Getter ve Setter metodları
}

