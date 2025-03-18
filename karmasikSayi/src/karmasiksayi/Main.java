package karmasiksayi;


public class Main {
    public static void main(String[] args) {
        String kSayi  = "3+5i";
        String kSayi2 = "5+8i";

        KarmasikSayi ks1 = new KarmasikSayi(kSayi);
        KSHesapMakinesi hesapMakinesi = new KSHesapMakinesi(kSayi, kSayi2);
        hesapMakinesi.topla().display();
        hesapMakinesi.cikarma().display();
    }
}