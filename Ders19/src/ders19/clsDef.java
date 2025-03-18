package ders19;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class clsDef {
    
    public void createFile(String pathWay){
        File nFile = new File(pathWay);
        if(!nFile.exists()){
            try {
            nFile.createNewFile();
            System.out.println("Dosya oluşturuldu");
            } catch (Exception e) {
                System.out.println("Dosya oluşturulamadi");
            }
        }
        else System.out.println("nFile isminde bir txt dosyası hali hazırda var!");
    }
    
    public void deleteFile(String pathWay){
        File nFile = new File(pathWay);
        nFile.delete();
    }
    
    public void takingValues(String pathWay,Inform content){
        File nFile = new File (pathWay);
        FileWriter writter = null;
        try {
            nFile.createNewFile();
            writter = new FileWriter(nFile);
            writter.write(content.readTo());
            writter.close();
        } 
        catch (Exception e) {
            System.out.println("Error code : 404");
        }
    }
    public void takeTo(){
        Inform nCar = new Inform();
        System.out.println("Lutfen araca ait bilgileri sırasıyla giriniz : (marka ,model ,renk ,uretim yılı ve fiyat)");
        Scanner putter = new Scanner (System.in);
        String _marka = putter.nextLine();
        String _model = putter.nextLine();
        String _renk = putter.nextLine();
        String _uretimYili = putter.nextLine();
        String _fiyat = putter.nextLine();
        nCar.araba(_marka, _model, _renk, _uretimYili, _fiyat);
    }
        
    }
