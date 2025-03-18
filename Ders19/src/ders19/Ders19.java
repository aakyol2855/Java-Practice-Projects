package ders19;

public class Ders19 {

    public static void main(String[] args) {
        clsDef nFile = new clsDef();
        String pathAddress = "C:\\Users\\aakyol28\\Documents\\NetBeansProjects\\Ders19\\src\\ders19\\dosya.txt";
        nFile.createFile(pathAddress);
        System.out.println("Program bitti.");
        Inform car = new Inform();
        
        nFile.takeTo();
        System.out.println(car.readTo());
        
        nFile.takingValues(pathAddress,car); 
    }
    
}
