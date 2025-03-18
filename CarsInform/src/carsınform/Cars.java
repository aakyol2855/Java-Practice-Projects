package carsınform;

import java.util.Scanner;

public class Cars {
    
    public static void main(String[] args) {
        Scanner nScanner = new Scanner (System.in);
        FileManagement newCase = new FileManagement();
        CarInformations nCar = new CarInformations();
        String pathAddress = "C:\\Users\\aakyol28\\Documents\\NetBeansProjects\\CarsInform\\src\\carsınform\\";
        String nPathWay = "cars.txt";
        String nameFile = new String();
        
        System.out.println("Dosya oluşturmak ister misiniz ? (Evet-Hayır)");
        String choose = nScanner.next();
        if(choose.equals("Evet")){
            System.out.println("Lütfen oluşturmak istediğiniz txt dosyası ismi giriniz : ");
            nameFile = nScanner.next();
            newCase.createFile(pathAddress+nameFile);
        }
        
        System.out.println("Dosyaya yeni araç bilgisi girmek ister misiniz? (Evet- Hayır)");
        choose = nScanner.next();
        if (choose.equals("Evet")) {
            int i = 0;
            System.out.println("lütfen kaç araç bilgisi gireceğiniz yazınz : ");
            int sayi = nScanner.nextInt();
            for(i=0 ; i<sayi ; i++){
                System.out.println("Lütfen araca ait bilgileri sırasıyla giriniz: (marka, model, renk, üretim yılı ve fiyat)");
                String marka = nScanner.next();
                String model = nScanner.next();
                String renk = nScanner.next();
                int uretimYili = nScanner.nextInt();
                String fiyat = nScanner.next();
                nCar.arabaAdd(marka, model, renk, uretimYili, fiyat);
                newCase.writeFile(pathAddress + nPathWay, nCar.readTo()); // Write to the file first
                nCar.readTo(); // Read from nCar
                System.out.println(nCar.readTo()); // Print the car information
                System.out.println("\n");
            }
        }
        
        int size = newCase.sizeOf(pathAddress + nameFile);
        
        System.out.println("Dosya Okuması yapmak ister misiniz ? ");
        choose = nScanner.next();
        if (choose.equals("Evet")||choose.equals("evet") ) {
            System.out.println("Okumak istediğiniz txt dosyasının adını giriniz : ");
            nameFile = nScanner.next();
            newCase.readFile(pathAddress+nameFile,size);
        }
        else nameFile = "cars.txt";
        
        System.out.println("En yeni aracı öğrenmek ister misiniz? ");
        choose = nScanner.next();
        if(choose.equals("evet")){
            newCase.parse(pathAddress+nPathWay, nCar, size,pathAddress);
            System.out.println("if'e girdi ");
        }
        
        
        
        System.out.println("Program bitti");
        
    }
}
