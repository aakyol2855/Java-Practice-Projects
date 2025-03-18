/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

/**
 *
 * @author HCLROSS
 */
public class Yonetici extends Kisi {
    
        private String departman;

    public Yonetici(String ad, Adres adres, String mail, Gun dogumTarihi, float maas,String departman) {
        super(ad, adres, mail, dogumTarihi, maas);
        this.departman=departman;
    }

    /**
     * @return the departman
     */
    public String getDepartman() {
        return departman;
    }

    /**
     * @param departman the departman to set
     */
    public void setDepartman(String departman) {
        this.departman = departman;
    }
        
    
}
