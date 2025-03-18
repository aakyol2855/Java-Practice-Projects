package aractakip;

import com.sun.source.tree.ContinueTree;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class kullaniciBilgileri {
    private String KullaniciAdi;
    private int KullaniciSifre;
    FileManagement nCase = new FileManagement();
    private String pathWay ="C:\\Users\\aakyol28\\Documents\\NetBeansProjects\\AracTakip\\src\\aractakip\\KullaniciBilgileri.txt" ;
    private Map<String, String> kullaniciBilgileri;
    
    public kullaniciBilgileri(String _kullaniciAdi,int _kullaniciSifre){
         kullaniciBilgileri = new HashMap<>();
         setkullaniciAdi(_kullaniciAdi);
         setkullaniciSifre(_kullaniciSifre);
    }
    
    public void dataGirisi(){
        File nFile = new File(pathWay);
        if(!nFile.exists()){
            nCase.createFile(pathWay);
        }
        if(nCase.searchInTextFile(pathWay, KullaniciAdi)){
            System.out.println("Bu isim daha önce alınmış");
        }
        else{
            String kullaniciVerileri = KullaniciAdi + " " + KullaniciSifre+"\n";
            nCase.writeFile(pathWay, kullaniciVerileri);
        }
    }
    
    public void dataReader(){
         try (BufferedReader reader = new BufferedReader(new FileReader(pathWay))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    String kullaniciAdi = tokens[0];
                    String sifre = tokens[1];
                    kullaniciBilgileri.put(kullaniciAdi, sifre);
                }
            }
            System.out.println("Kullanıcı bilgileri dosyadan okundu.");
        } catch (Exception e) {
            System.out.println("Kullanıcı bilgileri dosyadan okunamadı: " + e.getMessage());
        }
    }
    
    public void setkullaniciAdi(String kullaniciAdi){
        this.KullaniciAdi = kullaniciAdi;
    }
    public void setkullaniciSifre(int kullaniciSifre){
        this.KullaniciSifre = kullaniciSifre;
    }
    public String getKullaniciAdi(){
        return (this.KullaniciAdi);
    }
    public int getKullaniciSifre(){
        return (this.KullaniciSifre);
    }
    
    
}
