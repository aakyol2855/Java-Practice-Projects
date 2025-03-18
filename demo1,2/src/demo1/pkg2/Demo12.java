package demo1.pkg2;

import java.util.Scanner;

public class Demo12 {

    public static void main(String[] args) {
//        kalın sesli mi ince sesli mi bulmak için
        System.out.println("Lutfen bir kelime giriniz");
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        int sayac=0;
        for (int i = 0; i < word.length(); i++) {
            switch(word.charAt(i)){
                case 'A':
                case 'a':
                case 'e':
                case 'E':
                case 'ı':
                case 'I':
                case 'i':
                case 'o':
                case 'O':
                case 'ö':
                case 'u':
                case 'U':
                    sayac++;
                deafult:
                    break;
            }
        }
        System.out.println("Kelimedeki sesli harf sayısı =>"+sayac);
    }
}
