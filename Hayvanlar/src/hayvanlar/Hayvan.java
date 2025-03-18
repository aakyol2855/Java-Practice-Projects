package hayvanlar;


public class Hayvan {
    String renk;
    String beslenmeTuru;
    String habitat;
    int ayakSayisi;

    public Hayvan(String renk, String beslenmeTuru, String habitat, int ayakSayisi) {
        System.out.println("Hayvan sinifi olusturuldu!");
        this.renk = renk;
        this.beslenmeTuru = beslenmeTuru;
        this.habitat = habitat;
        this.ayakSayisi = ayakSayisi;

    }

    public Hayvan(){
        System.out.println("Hayvan sinifi olusturuldu");
    }
    public void ses(){
        System.out.println("Hayvan ses cikardi");

    }
    public void showInfo(){
        System.out.println("Renk: " + renk);
        System.out.println("Beslenme turu: " + beslenmeTuru);
        System.out.println("Habitat: " + habitat);
        System.out.println("Ayak sayisi: " + ayakSayisi);
    }
}
