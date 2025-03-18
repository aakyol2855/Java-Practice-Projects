package usalma;

import java.util.Scanner;

public class UsAlma {

    
    public static void main(String[] args) {
        Scanner nS = new Scanner(System.in);
        FileManagement n = new FileManagement();
        
        System.out.println("Üssünü almak sitediğiniz bir sayi yaziniz : ");
        int sayi = nS.nextInt();
        int us = nS.nextInt();
        
        System.out.println(n.usAlma(sayi, us));
    }
    
}
