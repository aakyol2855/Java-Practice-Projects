package haci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.Scanner;


public class FileManagement {
    int counter =0;
    
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
    
    
    public void readFile(String pathWay){
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
    
    public static void parse(String pathWay,int size,String mAddress){
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

