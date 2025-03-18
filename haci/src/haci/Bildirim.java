package haci;

public abstract class Bildirim {
    private int bildirimNo;
    private Gun olusturulmaZamani;
    private String icerik;
    private boolean gonderildi;

    public int getBildirimNo() {
        return bildirimNo;
    }

    /**
     * @param bildirimNo the bildirimNo to set
     */
    public void setBildirimNo(int bildirimNo) {
        this.bildirimNo = bildirimNo;
    }

    /**
     * @return the olusturulmaZamani
     */
    public Gun getOlusturulmaZamani() {
        return olusturulmaZamani;
    }

    /**
     * @param olusturulmaZamani the olusturulmaZamani to set
     */
    public void setOlusturulmaZamani(Gun olusturulmaZamani) {
        this.olusturulmaZamani = olusturulmaZamani;
    }

    /**
     * @return the icerik
     */
    public String getIcerik() {
        return icerik;
    }

    /**
     * @param icerik the icerik to set
     */
    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    /**
     * @return the gonderildi
     */
    public boolean isGonderildi() {
        return gonderildi;
    }

    /**
     * @param gonderildi the gonderildi to set
     */
    public void setGonderildi(boolean gonderildi) {
        this.gonderildi = gonderildi;
    }

    
}






