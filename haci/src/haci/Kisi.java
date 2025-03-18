package haci;

public class Kisi {
    private String ad;
    private Adres adres;
    private String mail;
    private Gun dogumTarihi;
    private float maas;
    String katagori;

    public Kisi(String ad, Gun dogumTarihi, String katagori) {
        this.ad = ad;
        this.dogumTarihi = dogumTarihi;
        this.katagori = katagori;
    }

    
    // Getter ve Setter metodları

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the adres
     */
    public Adres getAdres() {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the dogumTarihi
     */
    public Gun getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * @param dogumTarihi the dogumTarihi to set
     */
    public void setDogumTarihi(Gun dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    /**
     * @return the maas
     */
    public float getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(float maas) {
        this.maas = maas;
    }
}



