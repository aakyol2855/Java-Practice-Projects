package karmasiksayi;

public class KSHesapMakinesi {
    private KarmasikSayi sayi1;
    private KarmasikSayi sayi2;

    public KSHesapMakinesi(String kSayi1, String kSayi2){
        this.sayi1 = new KarmasikSayi(kSayi1);
        this.sayi2 = new KarmasikSayi(kSayi2);
    }

    public KarmasikSayi topla(){
        double reel = this.sayi1.getReel() + this.sayi2.getReel();
        double sanal = this.sayi1.getSanal() + this.sayi2.getSanal();
        return new KarmasikSayi(reel, sanal);
    }

    public KarmasikSayi cikarma(){
        double reel = this.sayi1.getReel() - this.sayi2.getReel();
        double sanal = this.sayi1.getSanal() - this.sayi2.getSanal();
        return new KarmasikSayi(reel, sanal);
    }
}
