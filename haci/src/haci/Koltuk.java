package haci;

public class Koltuk {
    protected String koltukNo;
    private KoltukTuru koltukTuru; // Koltuk türü: EKONOMI, BUSINESS veya FIRST_CLASS
    private String sinif;          // Koltuğun sınıfı (örneğin A, B, C gibi)

    // Constructor
    public Koltuk(String koltukNo, KoltukTuru koltukTuru, String sinif) {
        this.koltukNo = koltukNo;
        this.koltukTuru = koltukTuru;
        this.sinif = sinif;
    }

    // Getter ve Setter metodları
    public String getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(String koltukNo) {
        this.koltukNo = koltukNo;
    }

    public KoltukTuru getKoltukTuru() {
        return koltukTuru;
    }

    public void setKoltukTuru(KoltukTuru koltukTuru) {
        this.koltukTuru = koltukTuru;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Koltuk{" +
                "koltukNo='" + koltukNo + '\'' +
                ", koltukTuru=" + koltukTuru +
                ", sinif='" + sinif + '\'' +
                '}';
    }
}

