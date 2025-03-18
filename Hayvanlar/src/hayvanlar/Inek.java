package hayvanlar;

public class Inek extends Hayvan{

    public Inek(String renk, String beslenmeTuru, String habitat, int ayakSayisi){
        super(renk, beslenmeTuru, habitat, ayakSayisi);
        System.out.println("Inek sinifi olusturuldu");
    }

    @Override public void ses(){
        System.out.println("Mooooo");
    }

}
