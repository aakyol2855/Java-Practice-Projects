package aractakip;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarInformations {
    protected String cMarka;
    protected String cModel;
    protected int cServiszamani;
    private int cKm;
    private String cTur;
    protected String cPlaka;
    private String kullaniciAdi;
    private Map<String, String> aracBilgileri;
    
    
    public CarInformations() {
        this.aracBilgileri = new HashMap<>();
    }
    
    public void aracBilgileriniGir(String kullaniciAdi, String pathWay) {
        Scanner scanner = new Scanner(System.in);
        FileManagement nFile = new FileManagement();

        System.out.println("Araç markası: ");
        String marka = scanner.nextLine();
        System.out.println("Araç modeli: ");
        String model = scanner.nextLine();
        System.out.println("Araç km ");
        String km = scanner.nextLine();
        System.out.println("Araç türü ");
        String tur = scanner.nextLine();
        System.out.println("Araç Plakası ");
        String plaka = scanner.nextLine();
        int ss = Integer.parseInt(km);
        if (tur.equals("sedan") || tur.equals("hatchbak")) {
            ss = ss+15000;
        } else if (tur.equals("suv") || tur.equals("van")) {
            ss =ss+10000 ;
        }
        String servisSuresi = Integer.toString(ss);
        
        aracBilgileri.put("Marka", marka);
        aracBilgileri.put("Model", model);
        aracBilgileri.put("Km", km);
        aracBilgileri.put("tur", tur);
        aracBilgileri.put("plaka", plaka);
        aracBilgileri.put("ServisSuresi", servisSuresi);

        String aracBilgileriString = kullaniciAdi + " " + marka + " " + model + " " + km + " " + tur + " " + plaka + " " + servisSuresi + "\n";
        nFile.writeFile(pathWay + "arac_bilgileri.txt", aracBilgileriString);
    }
    
    public void aracBilgileriniYazdir(String kullaniciAdi, String pathAddress) {
        try {
            FileReader reader = new FileReader(pathAddress + "arac_bilgileri.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Kullanıcı adı - Marka - Model - Km - Tür - Plaka - bir sonraki servis süresi");
            while ((line = bufferedReader.readLine()) != null) {
                String[] aracBilgileri = line.split(" ");
                if (aracBilgileri.length == 7 && aracBilgileri[0].equals(kullaniciAdi)) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public String getMarka(){
        return this.cMarka;
    }

    public void setMarka(String _marka) {
        this.cMarka = _marka;
    }

    public String getModel() {
        return cModel;
    }

    public void setModel(String _model) {
        this.cModel = _model;
    }

    public int getUretimYili() {
        return cServiszamani;
    }

    public void setUretimYili(int _uretimYili) {
        this.cServiszamani = _uretimYili;
    }
    public void setKm(int cKm){
        this.cKm = cKm;
    }
    public int getKm(){
        return (this.cKm);
    }
    public void setTur(String cTur){
        this.cTur = cTur;
    }
    public String getTur(){
        return (this.cTur);
    }

    public String getPlaka() {
        return cPlaka;
    }

    public void setPlaka(String plaka) {
        this.cPlaka = plaka;
    }
    
    
}
