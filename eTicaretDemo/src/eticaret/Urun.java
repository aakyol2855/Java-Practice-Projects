package eticaret;

public abstract class Urun {
    protected String urunAdi;
    protected String urunNo;
    protected int fiyat;
    protected int stok;
    protected String aciklama;
    
    public abstract String urunBilgisi();
    /**
     * @return the urunAdi
     */
    public String getUrunAdi() {
        return urunAdi;
    }

    /**
     * @param urunAdi the urunAdi to set
     */
    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    /**
     * @return the urunNo
     */
    public String getUrunNo() {
        return urunNo;
    }

    /**
     * @param urunNo the urunNo to set
     */
    public void setUrunNo(String urunNo) {
        this.urunNo = urunNo;
    }

    /**
     * @return the fiyat
     */
    public int getFiyat() {
        return fiyat;
    }

    /**
     * @param fiyat the fiyat to set
     */
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    /**
     * @return the stok
     */
    public int getStok() {
        return stok;
    }

    /**
     * @param stok the stok to set
     */
    public void setStok(int stok) {
        this.stok = stok;
    }

    /**
     * @return the aciklama
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * @param aciklama the aciklama to set
     */
    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
    
    public void display(){
        System.out.println("Ürün adı : "+this.urunAdi +"\n"+"Ürün kodu : "+ this.urunNo + "\n"+"Ürün fiyatı : "+this.fiyat + "\n" + "Ürün stok sayısı : "+this.stok + "\n"+"Ürün açıklaması : "+this.aciklama);
    }
    
}
