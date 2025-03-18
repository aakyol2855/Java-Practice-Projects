package ıdpprojesi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagement {
     int counter = 0;
    
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
        File newFile = new File(pathWay);
        if (newFile.exists()) {
            try {
                newFile.delete();
                System.out.println("Dosya silme işlemi -> başarılı ! ");
            } catch (Exception e) {
                System.out.println("Dosya silme işlemi -> başarısız ! ");
            }
        }
    }
    
    public void writeFile(String pathWay,String content){
        File newFile = new File(pathWay);
        FileWriter newWriter=null;
        try {
            newFile.createNewFile();
            newWriter = new FileWriter(newFile, true);
            newWriter.write(content);
            newWriter.close();
        }
        catch (Exception e) {
            System.out.println("Yazma işlemi -> başarısız !");
            e.printStackTrace();

        }
        
    }
    
    
    public void readFile(String pathWay,int size){
        try {
            BufferedReader newReader = new BufferedReader(new FileReader(pathWay));
            String line ;
            while ((line = newReader.readLine()) != null){
                System.out.println(line);                    
            }
            newReader.close();
        } 
        catch (Exception e) {
            System.out.println("Size bulma işlemi --> Başarısız ! ");
        }
    }
    
    public int sizeOf(String pathWay){
        try {
            BufferedReader newReader = new BufferedReader(new FileReader(pathWay));
            String line ;
            while ((line = newReader.readLine()) != null){
                counter++;
            }
            newReader.close();
        } 
        catch (Exception e) {
            System.out.println("Size için okuma işlemi --> Başarısız ! ");
        }
        return counter;
    }
    
    public static void parse(String pathWay,Cars nCar,int size,String mAddress){
        int flag = 0;
        String [] priority = new String[size];
        try {
            BufferedReader newReader = new BufferedReader(new FileReader(pathWay));
            String line ;
            while ((line = newReader.readLine()) != null){
                String[] gecici = line.split(" ");
                priority[flag] = gecici[3];
                flag++;
            }
            FileManagement nFile = new FileManagement();
            for (int i = 0; i < size; i++) {
                nFile.writeFile(mAddress+"parse.txt", priority[i]+" ");
            }
            nFile.writeFile(mAddress+"parse.txt","\n");
            newReader.close();
        } 
        catch (Exception e) {
            System.out.println("parse işlemi hatalı ");
            e.printStackTrace();
        } 
    }
    
}
