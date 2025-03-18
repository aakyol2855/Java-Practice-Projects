package eticaret;

public class ETicaret {

    public static void main(String[] args) {
        ElektronikUrunler nUrun = new ElektronikUrunler();
        Giyim nGiyim = new Giyim();
        
        nUrun.urunAdi = "Laptop";
        nUrun.urunNo = "001";
        nUrun.stok = 22;
        nUrun.fiyat = 1500;
        nUrun.aciklama = "intel i7 işlemcili laptop";
        nUrun.display();
        System.out.println("\n---------------------------\n");
        nGiyim.urunAdi = "Palto";
        nGiyim.urunNo = "002";
        nGiyim.stok = 22;
        nGiyim.fiyat = 250;
        nGiyim.aciklama = "Unisex Yazlık-Kışlık palto";
        nGiyim.display();   
    }
}
