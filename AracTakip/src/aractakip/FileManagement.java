package aractakip;

import aractakip.CarInformations;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;


public class FileManagement extends CarInformations {
    int counter =0;
    
    
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
    
    public void writeFile(String pathWay, String content) {
        FileWriter newWriter = null;
        try {
            newWriter = new FileWriter(pathWay, true);
            newWriter.write(content);
            System.out.println("Dosyaya yazma işlemi başarılı!");
        } catch (IOException e) {
            System.out.println("Dosyaya yazma işlemi başarısız: " + e.getMessage());
        } finally {
            if (newWriter != null) {
                try {
                    newWriter.close();
                } catch (IOException e) {
                    System.out.println("Dosya kapatma hatası: " + e.getMessage());
                }
            }
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
    
    public static boolean searchInTextFile(String filePath, String searchString) {
        boolean found = false;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(searchString)) {
                    found = true;
                    break;
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return found;
    }
}

