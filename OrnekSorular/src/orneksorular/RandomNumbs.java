package orneksorular;

import java.util.Random;

public class RandomNumbs {
 
    public static double hesapla(int[] array){    
        double toplam = 0;
        for (int i = 0; i < 100; i++) {
            toplam+=array[i];
        }
        return toplam/100;
    }
    
    public static void main(String[] args){
        Random s = new Random();
        int[] numArray=new int[100];
        for (int i = 0; i < 100; i++) {
            numArray[i]=s.nextInt(1000);
        }
        System.out.println("");
        double ortalama = hesapla(numArray);
        System.out.println("Sayıların ortalaması : "+ortalama);
    }
}
