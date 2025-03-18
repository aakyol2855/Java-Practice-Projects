package filemanagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManagement {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("İslem sec(1-CreateFile 2-GetFileInfo 3-ReadFile 4-WriteFile)");
        int i = scn.nextInt();
        if(i == 1){
            createFile();
        }
        else if(i ==2){
            getFileInfo();
        }
        else if(i==3){
            try {
                readFile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(i ==4){
            System.out.println("Yazmak istediğiniz veriyi girin : ");
            scn.nextLine();
            String girdi = scn.nextLine();
            WriteFile(girdi);
        }
        else{
            System.out.println("gata");
        }
    }
    
    
    public static void createFile(){
        String pathname = "C:\\Users\\aakyol28\\Desktop\\coddin\\Java\\FileManagement\\Students.txt";
        File file = new File(pathname);
        try {
            if(file.createNewFile()){
                System.out.println("Dosya olusturuldu.");
            }
            else
                System.out.println("Dosya zaten mevcut!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void getFileInfo(){
        String pathname = "C:\\Users\\aakyol28\\Desktop\\coddin\\Java\\FileManagement\\students.txt";
        File file = new File(pathname);
        if(file.exists()){
            System.out.println("Dosya adı : "+file.getName());
            System.out.println("Dosya yolu : "+file.getAbsolutePath());
            System.out.println("Dosya okunabilir mi ? "+file.canRead());
            System.out.println("Dosya yazılabilir mi ? "+file.canWrite());
            System.out.println("Dosya büyüklüğü (byte)"+file.length());
            
        }
    }
    
    public static void readFile() throws FileNotFoundException{
        String pathname = "C:\\Users\\aakyol28\\Desktop\\coddin\\Java\\FileManagement\\students.txt";
        File file = new File(pathname);
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void WriteFile(String girdi){
        String pathname = "C:\\Users\\aakyol28\\Desktop\\coddin\\Java\\FileManagement\\students.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(pathname,true));
            writer.newLine();
            writer.write(girdi);
            System.out.println("sisteme yazıldı");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FileManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
