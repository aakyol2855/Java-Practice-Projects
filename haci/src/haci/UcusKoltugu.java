/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haci;

/**
 *
 * @author HCLROSS
 */
public class UcusKoltugu extends Koltuk{
    private float ucret;
    private String rezervasyonNo;
    public UcusKoltugu(String koltukNo, KoltukTuru koltukTuru, String sinif) {
        super(koltukNo, koltukTuru, sinif);
        this.ucret=ucret;
    }

    @Override
    public String getKoltukNo() {
        return koltukNo;
    }
    /**
     * @return the ucret
     */
    public float getUcret() {
        return ucret;
    }

    /**
     * @param ucret the ucret to set
     */
    public void setUcret(float ucret) {
        this.ucret = ucret;
    }

    /**
     * @return the rezervasyonNo
     */
    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    /**
     * @param rezervasyonNo the rezervasyonNo to set
     */
    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }
    
    
    
}
