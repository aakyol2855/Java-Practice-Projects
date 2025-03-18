package ders.pkg31;

public class pubpriv {

    private String isim;
    private String soyIsim;
    private int yas;
    private int dogumYili;

    public void Read1() {
        System.out.println("Isim => " + getIsim());
    }

    private void Read2() {
        System.out.println("Isim => " + getIsim());
        System.out.println("Soyisim => " + getSoyIsim());
    }

    protected void Read3() {
        System.out.println("Isim => " + getIsim());
        System.out.println("Soyisim => " + getSoyIsim());
        System.out.println("Yaş => " + getYas());
    }

    void Read4() {
        System.out.println("Isim => " + getIsim());
        System.out.println("Soyisim => " + getSoyIsim());
        System.out.println("Yaş => " + getYas());
        System.out.println("Doğum Yılı => " + getDogumYili());
    }
    
    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the soyIsim
     */
    public String getSoyIsim() {
        return soyIsim;
    }

    /**
     * @param soyIsim the soyIsim to set
     */
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    /**
     * @return the yas
     */
    public int getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(int yas) {
        this.yas = yas;
    }

    /**
     * @return the dogumYili
     */
    public int getDogumYili() {
        return dogumYili;
    }

    /**
     * @param dogumYili the dogumYili to set
     */
    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

}
