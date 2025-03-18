package abstractclasses;

public class Isci extends Muhasebe{

    
    protected int saatUcreti() {
        return 10;
    }

    
    protected int calismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci{" + 
                "sirektİsmi="+sirketIsmi+
                ", saarUcreti=" + saatUcreti+
                ", AylikCalismaSuresi="+calismaSuresi+
                ", maas="+maas+
                ", isim="+isim+'\''+
                ", soyisim="+soyIsim+'\''+
                ", tcNo="+tcNo+'\''+
                ", telefon="+telefon+'\''+
                ", iseBaslamaTarihi"+iseBaslamaTarihi+'\''+
                ", sigortaNo"+sigortaNo+'\''+
                ", personelNo"+personelNo +'\''+
                '}';
    }
    
    
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        isci1.maas = isci1.maas(isci1.saatUcreti(),isci1.calismaSuresi);
        isci1.saatUcreti = isci1.saatUcreti();
        isci1.calismaSuresi = isci1.calismaSuresi();
        isci1.maas = isci1.maas(isci1.saatUcreti, isci1.calismaSuresi);
        isci1.isim = "Hasan";
        isci1.soyIsim = "Tural";
        isci1.tcNo = "18285543290";
        System.out.println(isci1);
    }
    
}
