package usalma;

public class FileManagement {
    
    public int usAlma(int sayi,int us){
        if(us == 0){
            return 1;
        }
        return sayi * usAlma(sayi,us-1);
    }
    
    
}
