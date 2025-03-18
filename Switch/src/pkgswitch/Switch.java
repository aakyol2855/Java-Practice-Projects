package pkgswitch;

import java.util.Scanner;


public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen aldığınız notu giriniz :");
        Scanner id1= new Scanner(System.in);
        char grade=id1.next().charAt(0);
        switch(grade){
            case 'A':
            case 'a':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'b':
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case 'C':
            case 'c':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
            case 'd':
                System.out.println("Vasat Altı : Geçtiniz");
                break;
            case 'F':
            case 'f':
                System.out.println("Maalesef Kaldınız!!");
                break;
            default:
                System.out.println("Geçersiz no girdiniz!!");
        }

    }
    
}
