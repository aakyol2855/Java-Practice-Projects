package karmasiksayi;

public class KarmasikSayi {
    private double reel;
    private double sanal;

    public KarmasikSayi(String kSayi) {

        String[] kSayiParcalari = kSayi.split("\\+");
        this.reel = Double.parseDouble(kSayiParcalari[0]);
        this.sanal = Double.parseDouble(kSayiParcalari[1].substring(0, kSayiParcalari[1].length() - 1));
    }

    public KarmasikSayi(double reel, double sanal){
        this.reel = reel;
        this.sanal = sanal;
    }

    public double getReel(){
        return this.reel;
    }

    public double getSanal(){
        return this.sanal;
    }

    public void display(){
        System.out.println(this.reel + " + " + this.sanal + "i");
    }
}
