package hayvanlar;

public class Tavuk extends Hayvan{
    private String gagasi;
    public Tavuk(String renk, String beslenmeTuru, String habitat, int ayakSayisi, String gagasi){
        super(renk, beslenmeTuru, habitat, ayakSayisi);
        System.out.println("Tavuk sinifi olusturuldu");
        this.gagasi = gagasi;
    }

    public String getGagasi(){
        return gagasi;
    }

    @Override public void ses(){
        System.out.println("gıt gıt gıdaak");
    }

}
