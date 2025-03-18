package abstractclasses;

public abstract class Muhasebe extends Personel{
    protected int saatUcreti;
    protected int calismaSuresi;
    protected int maas;
    
    protected abstract int saatUcreti();
    protected abstract int calismaSuresi();
    
    protected int maas(int saatUcreti , int calismaSuresi){
        int maas = saatUcreti * calismaSuresi;
        return maas;
    }
    
}
